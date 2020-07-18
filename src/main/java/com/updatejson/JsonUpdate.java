package com.updatejson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;

public class JsonUpdate {
	String district, contact;
	String districtNew, contactNew;
	JSONObject cbsJson, cbsJsonNew, kycJson;
	String accountNoOldCbs, accountNoNewCbs, accountName, accountNameNew, account;
	String addressTypeOldCbs, addressTypeNewCbs;
	JSONObject kycJsonUpdated;
	int isUpdated = 0;
	String addressUpdatedKyc;

	static Set<AddressSet> addressSet = new HashSet<>();
	static Set<AccountSet> accountSet = new HashSet<>();
	static Set<RelationSet> relationSet = new HashSet<>();

	Map<String, Object> subMap = new HashMap<String, Object>(); // carries a string to be compared and modified values

	public void updateCBS(String cbs, String cbsNew, String kyc) {

		cbsJson = new JSONObject(cbs);

		cbsJsonNew = new JSONObject(cbsNew);

		// kycJson=updatedKycJson;

		// data of addresses node
		int addressTypeCbsLen = cbsJson.getJSONArray("addresses").length();
		for (int j = 0; j < addressTypeCbsLen; j++) {

			if (isUpdated == 1) {
				// get new kyc json
				kyc = UpdatedKycJson.getNewKycJson().toString();
			}
			addressSet.clear();
			addressTypeOldCbs = cbsJson.getJSONArray("addresses").getJSONObject(j).getString("address_type");
			addressTypeNewCbs = cbsJsonNew.getJSONArray("addresses").getJSONObject(j).getString("address_type");
			district = cbsJson.getJSONArray("addresses").getJSONObject(j).getString("district");
			contact = cbsJson.getJSONArray("addresses").getJSONObject(j).getString("contact");
			districtNew = cbsJsonNew.getJSONArray("addresses").getJSONObject(j).getString("district");
			contactNew = cbsJsonNew.getJSONArray("addresses").getJSONObject(j).getString("contact");
			addressSet.add(new AddressSet(addressTypeNewCbs, contactNew, districtNew));

			subMap.clear();
			if (addressTypeOldCbs.equals(addressTypeNewCbs)) {
				if (!districtNew.equals(district) || districtNew.equals(district)) {
					subMap.put("district", districtNew);
				}

				if (!contactNew.equals(contact) || contactNew.equals(contact)) {
					subMap.put("contact", contactNew);
				}
				updateKycAddressNode(subMap, kyc);

			}

		}
		addressUpdatedKyc=kyc;
		subMap.clear();
		int accountsArrLen = cbsJson.getJSONArray("accounts").length();
		for (int k = 0; k < accountsArrLen; k++) {
			if (isUpdated == 1) {
				// get new kyc json 
				addressUpdatedKyc =UpdatedKycJson.getNewKycJson().toString();
			}

			accountSet.clear();
			accountNoOldCbs = cbsJson.getJSONArray("accounts").getJSONObject(k).getString("account_number");
			accountNoNewCbs = cbsJsonNew.getJSONArray("accounts").getJSONObject(k).getString("account_number");
			accountName = cbsJson.getJSONArray("accounts").getJSONObject(k).getString("account_name");
			accountNameNew = cbsJsonNew.getJSONArray("accounts").getJSONObject(k).getString("account_name");
			accountSet.add(new AccountSet(accountNoNewCbs, accountNameNew));

			System.out.println("account old...."+accountNoOldCbs);
			System.out.println("account new...+"+accountNoNewCbs);
			subMap.clear();
			if (accountNoOldCbs.equals(accountNoNewCbs)) {
				if (!accountNameNew.equals(accountName) || accountName.equals(accountName)) {
					subMap.put("accountName", accountNameNew);
				}

				updateKycAccountsNode(subMap, addressUpdatedKyc);
			}

		}
		System.out.println("address updated kyc is....."+"\n"+addressUpdatedKyc);
	}

	// ..................................update address
	// node..............................
	public void updateKycAddressNode(Map<String, Object> addressSubMap, String kyc) {
		System.out.println("address sub map is.."+addressSubMap);
		kycJson = new JSONObject(kyc);
		int arrLen = kycJson.getJSONArray("addressInfo").length();
		addressSet.forEach(cbs -> {
			for (int i = 0; i < arrLen; i++) {
				String addressTypeKyc = kycJson.getJSONArray("addressInfo").getJSONObject(i).getString("address_type");

				if (cbs.getAddressType().equals(addressTypeKyc)) {

					// update kyc
					if (!kycJson.getJSONArray("addressInfo").getJSONObject(i).getString("district")
							.equals(addressSubMap.get("district"))
							|| kycJson.getJSONArray("addressInfo").getJSONObject(i).getString("district").equals("")) {
						kycJson.getJSONArray("addressInfo").getJSONObject(i).put("district",
								addressSubMap.get("district"));
						isUpdated = 1;
						kycJsonUpdated = kycJson;
					}
					if (!kycJson.getJSONArray("addressInfo").getJSONObject(i).getString("phone_no")
							.equals(addressSubMap.get("contact"))
							|| kycJson.getJSONArray("addressInfo").getJSONObject(i).getString("phone_no").equals("")) {
						kycJson.getJSONArray("addressInfo").getJSONObject(i).put("phone_no",
								addressSubMap.get("contact"));
						isUpdated = 1;
						kycJsonUpdated = kycJson;
					}
				}
			}

			if (isUpdated != 0) {
				// pass new kyc json for future use
				UpdatedKycJson.setNewKycJson(kycJsonUpdated);
			}

		});

	}

	// ..................................accounts 
	// node..............................

	public void updateKycAccountsNode(Map<String, Object> accountSubMap, String addressUpdatedKyc) {
		System.out.println("account sub map is..."+accountSubMap);
		JSONObject addressUpdatedKycJson = new JSONObject(addressUpdatedKyc);
		int accountsArrLen = kycJson.getJSONArray("accountsInfo").length();
		System.out.println("account array length" + accountsArrLen);
		accountSet.forEach(cbs -> {
			for (int i = 0; i < accountsArrLen; i++) {
				String accountNoKyc = addressUpdatedKycJson.getJSONArray("accountsInfo").getJSONObject(i).getString("account_no");
				if (cbs.getAccountNo().equals(accountNoKyc)) {

					// update kyc System.out.println("i.............." + i);
					if (!addressUpdatedKycJson.getJSONArray("accountsInfo").getJSONObject(i).getString("account_name")
							.equals(accountSubMap.get("accountName"))
							|| addressUpdatedKycJson.getJSONArray("accountsInfo").getJSONObject(i).getString("account_name").equals("")) {
						addressUpdatedKycJson.getJSONArray("accountsInfo").getJSONObject(i).put("account_name",accountSubMap.get("accountName"));
						isUpdated = 1;
						kycJsonUpdated = addressUpdatedKycJson;
						System.out.println("accounts updated kyc is..."+"\n"+kycJsonUpdated);
					}

				}
			}

			if (isUpdated != 0) { // pass new kyc json for future use
				UpdatedKycJson.setNewKycJson(kycJsonUpdated);
			}

		});
		
		
		
		
		System.out.println("final kyc json is....."+"\n"+UpdatedKycJson.getNewKycJson());

	}
	

}
