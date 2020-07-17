package com.updatejson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;

public class JsonUpdate {
	String district, contact;
	Boolean isUpdated = false;
	String districtNew, contactNew;
	JSONObject cbsJson, cbsJsonNew, kycJson;
	String accountNo, accountName, accountNameNew;

	static Set<AddressSet> addressSet = new HashSet<>();
	static Set<AccountSet> accountSet = new HashSet<>();

	Map<String, Object> subMap = new HashMap<String, Object>(); // carries a string to be compared and modified values
	// Map<String, Map<String, Object>> updatedValueMap = new HashMap<String,
	// Map<String, Object>>();

	public void updateCBS(String cbs, String cbsNew, String kyc) {

		cbsJson = new JSONObject(cbs);
		cbsJsonNew = new JSONObject(cbsNew);

		String addressTypeOldCbs = cbsJson.getJSONArray("addresses").getJSONObject(0).getString("address_type");
		String addressTypeNewCbs = cbsJsonNew.getJSONArray("addresses").getJSONObject(0).getString("address_type");

		String accountNumberOldCbs = cbsJson.getJSONArray("accounts").getJSONObject(0).getString("account_number");
		String accountNumberNewCbs = cbsJsonNew.getJSONArray("accounts").getJSONObject(0).getString("account_number");

		// data of addresses node
		district = cbsJson.getJSONArray("addresses").getJSONObject(0).getString("district");
		contact = cbsJson.getJSONArray("addresses").getJSONObject(0).getString("contact");
		districtNew = cbsJsonNew.getJSONArray("addresses").getJSONObject(0).getString("district");
		contactNew = cbsJsonNew.getJSONArray("addresses").getJSONObject(0).getString("contact");
		addressSet.add(new AddressSet(addressTypeNewCbs, contact, district));

		// data of accounts node
		accountName = cbsJson.getJSONArray("accounts").getJSONObject(0).getString("account_name");
		accountNameNew = cbsJsonNew.getJSONArray("accounts").getJSONObject(0).getString("account_name");
		accountSet.add(new AccountSet(accountNumberNewCbs, accountName));
		// accountSet.forEach(n -> System.out.println(n.getAccountName()));

		// data of accounts node
		String accountName = cbsJson.getJSONArray("accounts").getJSONObject(0).getString("account_name");
		String accountNameNew = cbsJsonNew.getJSONArray("accounts").getJSONObject(0).getString("account_name");

		// if value according to the address_type, in cbs updates and hence in kyc with
		// the same data
		subMap.clear();
		if (addressTypeOldCbs.equals(addressTypeNewCbs)) {
			if (!district.equals(districtNew)) {
				subMap.put("district", districtNew);
			}

			if (!contact.equals(contactNew)) {
				subMap.put("contact", contactNew);
			}
		}

		if (accountNumberOldCbs.equals(accountNumberNewCbs)) {
			if (!accountName.equals(accountNameNew)) {
				subMap.put("accountName", accountNameNew);
			}
		}
		System.out.println("final submap is....." + subMap);
		updateKYC(subMap, kyc);

	}

	public void updateKYC(Map<String, Object> updatedMap, String kyc) {
		System.out.println("update KYC data.............");
		
		JSONObject obj = new JSONObject(updatedMap);
		kycJson = new JSONObject(kyc);

		/* ...................................address node.............. */
		int arrLen = kycJson.getJSONArray("addressInfo").length();
		addressSet.forEach(cbs -> {
			for (int i = 0; i < arrLen; i++) {
				String addressTypeKyc = kycJson.getJSONArray("addressInfo").getJSONObject(i).getString("address_type");
				if (cbs.getAddressType().equals(addressTypeKyc)) {
					if (subMap.containsKey("district")) {
						kycJson.getJSONArray("addressInfo").getJSONObject(i).put("district", subMap.get("district"));
					}

					else if (kycJson.getJSONArray("addressInfo").getJSONObject(i).getString("district").equals("")) {
						kycJson.getJSONArray("addressInfo").getJSONObject(i).put("district", districtNew);

					}
					if (subMap.containsKey("contact")) {
						kycJson.getJSONArray("addressInfo").getJSONObject(i).put("phone_no", subMap.get("contact"));
					} else if (kycJson.getJSONArray("addressInfo").getJSONObject(i).getString("phone_no").equals("")) {
						kycJson.getJSONArray("addressInfo").getJSONObject(i).put("phone_no", contactNew);
					}
				}
			}
		});

		/* .....................start of..............accounts node.............. */
		int accountsLen = kycJson.getJSONArray("accountsInfo").length();

		accountSet.forEach(cbs -> {
			for (int i = 0; i < accountsLen; i++) {
				String accountNameKyc = kycJson.getJSONArray("accountsInfo").getJSONObject(i).getString("account_no");
				if (cbs.getAccountNo().equals(accountNameKyc)) {
					if (subMap.containsKey("accountName")) {
						kycJson.getJSONArray("accountsInfo").getJSONObject(i).put("account_name",
								subMap.get("accountName"));
					}

					else if (kycJson.getJSONArray("accountsInfo").getJSONObject(i).getString("account_name")
							.equals("")) {
						kycJson.getJSONArray("accountsInfo").getJSONObject(i).put("account_name", accountNameNew);

					}
				}
			}
		});
		/* ..............end of.....................accounts node.............. */

		System.out.println("updpated kyc json......" + kycJson);
		System.out.println("updated cbs json.........." + cbsJson);
		System.out.println(
				"final json output is.." + (kycJson.toString().substring(0, kycJson.toString().length() - 1) + ",")
						.concat(cbsJson.toString().substring(1)));

	}

}
