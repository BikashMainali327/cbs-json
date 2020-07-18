package com.updatejson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UpdateJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateJsonApplication.class, args);
		
		JsonUpdate jsonUpdate=new JsonUpdate();
		String cbsJson = "{\r\n" + 
				"  \"seqNo\": 2,\r\n" + 
				"  \"gender\": \"Male\",\r\n" + 
				"  \"offPhone\": \"0155555\",\r\n" + 
				"  \"companyName\": \"Datum System PVT.LTD\",\r\n" + 
				"  \"mobileNo\": \"9860662247\",\r\n" + 
				"  \"pagerNo\": \"55555\",\r\n" + 
				"  \"salutation\": \"mr.\",\r\n" + 
				"  \"idType\": \"Citizenship\",\r\n" + 
				"  \"districtCode\": \"001\",\r\n" + 
				"  \"nepDate\": \"\",\r\n" + 
				"  \"citizenNumIssued\": \"1996-09-06\",\r\n" + 
				"  \"nepCtzDate\": \"2063-05-08\",\r\n" + 
				"  \"panNepDate\": \"2072-08-06\",\r\n" + 
				"  \"address2Dist\": \"12562\",\r\n" + 
				"  \"telephone2\": null,\r\n" + 
				"  \"isMinor\": \"2\",\r\n" + 
				"  \"personalIdentyIssuedAuth\": \"2\",\r\n" + 
				"  \"personalIdentIssDate\": \"2017-05-02\",\r\n" + 
				"  \"passportIssuingAuthority\": \"2\",\r\n" + 
				"  \"citizenIssuingAuthority\": \"2\",\r\n" + 
				"  \"comRegNum\": \"2\",\r\n" + 
				"  \"comRegAuth\": \"2\",\r\n" + 
				"  \"accounts\": [\r\n" + 
				"    {\r\n" + 
				"      \"seqNo\": 4,\r\n" + 
				"      \"accountsRelatedPeople\": [\r\n" + 
				"        {\r\n" + 
				"          \"seqNo\": 203,\r\n" + 
				"          \"signSerNo\": \"DAWADI\",\r\n" + 
				"          \"addresses\": null,\r\n" + 
				"          \"identifications\": null,\r\n" + 
				"          \"relations\": null,\r\n" + 
				"          \"scountryCode\": null,\r\n" + 
				"          \"sisSignatory\": \"CHIEF ACCOUNTS & FINANCE\",\r\n" + 
				"          \"sisDirector\": \"T\",\r\n" + 
				"          \"swardNo\": \"KATHMANDU\",\r\n" + 
				"          \"scity\": null,\r\n" + 
				"          \"sstate\": null,\r\n" + 
				"          \"sphoneNo\": \"003\",\r\n" + 
				"          \"smobileNo\": \"Secondary\",\r\n" + 
				"          \"smotherName\": null,\r\n" + 
				"          \"sfathersName\": \"UMA DEVI DAWADI\",\r\n" + 
				"          \"sgmotherName\": \"JANAK PRASAD DAWADI\",\r\n" + 
				"          \"sgfathersName\": null,\r\n" + 
				"          \"sspouseName\": \"JANAK NATH DAWADI\",\r\n" + 
				"          \"sidExpNepDate\": null,\r\n" + 
				"          \"person_type\": \"Signatory\",\r\n" + 
				"          \"date_of_birth\": null,\r\n" + 
				"          \"date_of_birth_bs\": \"1922-07-26\",\r\n" + 
				"          \"first_name\": \"Shyam\",\r\n" + 
				"          \"middle_name\": \"ROSHAN\",\r\n" + 
				"          \"last_name\": null,\r\n" + 
				"          \"issuing_authority\": \"BIPANA DHITAL DAWADI\",\r\n" + 
				"          \"primary_identification_document_type\": \"Disctict Administration Office\",\r\n" + 
				"          \"primary_identification_document_no\": \"Citizenship         \",\r\n" + 
				"          \"issued_district\": \"7731                \",\r\n" + 
				"          \"issue_date\": \"028\",\r\n" + 
				"          \"issue_date_bs\": \"1999-01-06\",\r\n" + 
				"          \"expiry_date\": \"22/09/2055\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"seqNo\": 202,\r\n" + 
				"          \"signSerNo\": \"CHHETRI\",\r\n" + 
				"          \"addresses\": null,\r\n" + 
				"          \"identifications\": null,\r\n" + 
				"          \"relations\": null,\r\n" + 
				"          \"scountryCode\": null,\r\n" + 
				"          \"sisSignatory\": \"TEACHER\",\r\n" + 
				"          \"sisDirector\": null,\r\n" + 
				"          \"swardNo\": \"POKHARA\",\r\n" + 
				"          \"scity\": null,\r\n" + 
				"          \"sstate\": null,\r\n" + 
				"          \"sphoneNo\": \"004\",\r\n" + 
				"          \"smobileNo\": \"Primary\",\r\n" + 
				"          \"smotherName\": null,\r\n" + 
				"          \"sfathersName\": \"MAYA DEVI CHHETRI\",\r\n" + 
				"          \"sgmotherName\": \"GAMMAR BAHADUR CHHETRI\",\r\n" + 
				"          \"sgfathersName\": null,\r\n" + 
				"          \"sspouseName\": \"KARBIR CHHETRI\",\r\n" + 
				"          \"sidExpNepDate\": null,\r\n" + 
				"          \"person_type\": \"Signatory\",\r\n" + 
				"          \"date_of_birth\": null,\r\n" + 
				"          \"date_of_birth_bs\": \"1972-10-11\",\r\n" + 
				"          \"first_name\": \"Ram\",\r\n" + 
				"          \"middle_name\": \"DHAN\",\r\n" + 
				"          \"last_name\": \"BAHADUR\",\r\n" + 
				"          \"issuing_authority\": \"GANGA LAMICHHANE CHHETRI\",\r\n" + 
				"          \"primary_identification_document_type\": \"Disctict Administration Office\",\r\n" + 
				"          \"primary_identification_document_no\": \"Citizenship         \",\r\n" + 
				"          \"issued_district\": \"22118               \",\r\n" + 
				"          \"issue_date\": \"041\",\r\n" + 
				"          \"issue_date_bs\": \"1993-12-07\",\r\n" + 
				"          \"expiry_date\": \"22/08/2050\"\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"account_number\": \"1111111111111111111111111111111\",\r\n" + 
				"      \"sol_id\": null,\r\n" + 
				"      \"account_type\": \"\",\r\n" + 
				"      \"account_status_type\": null,\r\n" + 
				"      \"cy_code\": \"NPR\",\r\n" + 
				"      \"account_name\": \"old cbs account\",\r\n" + 
				"      \"is_dormant\": null,\r\n" + 
				"      \"is_blocked\": null,\r\n" + 
				"      \"is_special\": null,\r\n" + 
				"      \"account_open_date\": null,\r\n" + 
				"      \"last_transaction_date\": null\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"roAddress1\": \"2\",\r\n" + 
				"  \"roAddCountry\": \"2\",\r\n" + 
				"  \"roState\": \"2\",\r\n" + 
				"  \"roDistAdd\": \"015\",\r\n" + 
				"  \"roAddress2\": \"2\",\r\n" + 
				"  \"roAddress3\": \"2\",\r\n" + 
				"  \"roWardNo\": null,\r\n" + 
				"  \"typeOfBusinessDetail\": \"2\",\r\n" + 
				"  \"typeOfClient\": \"22\",\r\n" + 
				"  \"addresses\": [\r\n" + 
				"    {\r\n" + 
				"      \"address\": \"Kathmandu\",\r\n" + 
				"      \"district\": \"permanent district cbs old\",\r\n" + 
				"      \"country\": \"India\",\r\n" + 
				"      \"contact\": \"permanent contact cbs old\",\r\n" + 
				"      \"city\": \"2\",\r\n" + 
				"      \"province\": \"Province 2\",\r\n" + 
				"      \"zone\": \"12562\",\r\n" + 
				"      \"address_type\": \"Permanent\",\r\n" + 
				"      \"ward_no\": \"2\",\r\n" + 
				"      \"mn_vdc\": \" pokhara\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"address\": \"9860662247\",\r\n" + 
				"      \"district\": \"communication district cbs old\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"contact\": \"communication contact cbs old\",\r\n" + 
				"      \"city\": \"2\",\r\n" + 
				"      \"province\": \"Province 2\",\r\n" + 
				"      \"zone\": \"Mechi\",\r\n" + 
				"      \"address_type\": \"Communication\",\r\n" + 
				"      \"ward_no\": \"2\",\r\n" + 
				"      \"mn_vdc\": \"9860662247\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"address\": \"2\",\r\n" + 
				"      \"district\": \"register district cbs old\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"contact\": \"register contact cbs old\",\r\n" + 
				"      \"city\": \"2\",\r\n" + 
				"      \"province\": \"Province 2\",\r\n" + 
				"      \"zone\": \"Solukhumbu\",\r\n" + 
				"      \"address_type\": \"Registered Address\",\r\n" + 
				"      \"ward_no\": null,\r\n" + 
				"      \"mn_vdc\": \"2\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"identifications\": [\r\n" + 
				"    {\r\n" + 
				"      \"primary_identification_document_type\": \"Citizenship\",\r\n" + 
				"      \"primary_identification_document_no\": \"55555555\",\r\n" + 
				"      \"issued_district\": \"chitwan\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"issue_date\": \"1996-09-06\",\r\n" + 
				"      \"issue_date_bs\": \"2063-05-08\",\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"issuing_authority\": \"District Administration Office\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"primary_identification_document_type\": \"Passport\",\r\n" + 
				"      \"primary_identification_document_no\": \"555555555\",\r\n" + 
				"      \"issued_district\": \"2\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"issue_date\": \"2017-05-02\",\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"expiry_date\": \"2030-05-06\",\r\n" + 
				"      \"issuing_authority\": \"Ministry of Foreign Affairs\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"relations\": [\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Bikash P Mainali\",\r\n" + 
				"      \"relation_type\": \"Spouse\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Sad Kumari Thapa\",\r\n" + 
				"      \"relation_type\": \"Grandmother\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Rabina Thapa\",\r\n" + 
				"      \"relation_type\": \"Daughter\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Rubina Thapa\",\r\n" + 
				"      \"relation_type\": \"Daughter\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Heena Thapa\",\r\n" + 
				"      \"relation_type\": \"Daughter-in-law\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Robert Thapa\",\r\n" + 
				"      \"relation_type\": \"Son\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Ful Kumari Thapa\",\r\n" + 
				"      \"relation_type\": \"Mother\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Harita Thapa\",\r\n" + 
				"      \"relation_type\": \"Daughter-in-law\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Happy Thapa\",\r\n" + 
				"      \"relation_type\": \"Grandfather\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Kumar Jung Thapa\",\r\n" + 
				"      \"relation_type\": \"Father-in-law\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"2\",\r\n" + 
				"      \"relation_type\": \"Spouse\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Rabin Thapa\",\r\n" + 
				"      \"relation_type\": \"Son\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Ful Kumar Thapa\",\r\n" + 
				"      \"relation_type\": \"Father\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"relatedPeople\": [\r\n" + 
				"    {\r\n" + 
				"      \"seqNo\": 3,\r\n" + 
				"      \"person_type\": \"Joint account holder\",\r\n" + 
				"      \"first_name\": \"jh\",\r\n" + 
				"      \"middle_name\": null,\r\n" + 
				"      \"last_name\": \"hb\",\r\n" + 
				"      \"primary_identification_document_type\": null,\r\n" + 
				"      \"primary_identification_document_no\": null,\r\n" + 
				"      \"issued_authority\": null,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"seqNo\": 2,\r\n" + 
				"      \"person_type\": \"Nominee\",\r\n" + 
				"      \"first_name\": \"l\",\r\n" + 
				"      \"middle_name\": \"l\",\r\n" + 
				"      \"last_name\": \"l\",\r\n" + 
				"      \"primary_identification_document_type\": \"n\",\r\n" + 
				"      \"primary_identification_document_no\": \"n\",\r\n" + 
				"      \"issued_authority\": \"n\",\r\n" + 
				"      \"issue_date_bs\": \"\",\r\n" + 
				"      \"issue_date\": \"\",\r\n" + 
				"      \"expiry_date\": \"\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"seqNo\": 2,\r\n" + 
				"      \"person_type\": \"Benefial Owner\",\r\n" + 
				"      \"first_name\": \"b\",\r\n" + 
				"      \"middle_name\": \"b\",\r\n" + 
				"      \"last_name\": \"b\",\r\n" + 
				"      \"primary_identification_document_type\": \"b\",\r\n" + 
				"      \"primary_identification_document_no\": \"b\",\r\n" + 
				"      \"issued_authority\": \"b\",\r\n" + 
				"      \"issue_date_bs\": \"\",\r\n" + 
				"      \"issue_date\": \"\",\r\n" + 
				"      \"expiry_date\": \"\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"involvements\": null,\r\n" + 
				"  \"registrations\": [\r\n" + 
				"    {\r\n" + 
				"      \"com_regd_num\": \"2\",\r\n" + 
				"      \"com_regd_auth\": \"2\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"gfathersName\": \"Happy Thapa\",\r\n" + 
				"  \"gmotherName\": \"Sad Kumari Thapa\",\r\n" + 
				"  \"pannumberIssDist\": \"2\",\r\n" + 
				"  \"pcity\": \"2\",\r\n" + 
				"  \"ccity\": \"2\",\r\n" + 
				"  \"pvdcMdc\": \"2\",\r\n" + 
				"  \"cvdcMdc\": \"2\",\r\n" + 
				"  \"pstate\": \"2\",\r\n" + 
				"  \"cstate\": \"2\",\r\n" + 
				"  \"cust_id\": \"121\",\r\n" + 
				"  \"first_name\": \"Sushil Acharya\",\r\n" + 
				"  \"f_name\": \"Sushil\",\r\n" + 
				"  \"m_name\": \"\",\r\n" + 
				"  \"l_name\": \"Acharya\",\r\n" + 
				"  \"date_of_birth\": \"1995-06-17\",\r\n" + 
				"  \"marital_status\": \"Single\",\r\n" + 
				"  \"pan_number\": \"55555\",\r\n" + 
				"  \"pan_number_issued\": \"1998-09-08\",\r\n" + 
				"  \"ownership\": \"001 Individual\",\r\n" + 
				"  \"branch_sol_id\": \"2\",\r\n" + 
				"  \"occupation_type\": \"support officer\",\r\n" + 
				"  \"business_description\": \"2\",\r\n" + 
				"  \"client_category\": \"Sole Proprietor\",\r\n" + 
				"  \"legal_customer_constitution\": \"PROPRIETORSHIP\",\r\n" + 
				"  \"natural_customer_constitution\": \"INDIVIDUAL\",\r\n" + 
				"  \"incorporation_state\": \"\",\r\n" + 
				"  \"incorporation_country\": \"2\"\r\n" + 
				"}";
		
		
		String cbsNew = "{\r\n" + 
				"  \"seqNo\": 2,\r\n" + 
				"  \"gender\": \"Male\",\r\n" + 
				"  \"offPhone\": \"0155555\",\r\n" + 
				"  \"companyName\": \"Datum System PVT.LTD\",\r\n" + 
				"  \"mobileNo\": \"9860662247\",\r\n" + 
				"  \"pagerNo\": \"55555\",\r\n" + 
				"  \"salutation\": \"mr.\",\r\n" + 
				"  \"idType\": \"Citizenship\",\r\n" + 
				"  \"districtCode\": \"001\",\r\n" + 
				"  \"nepDate\": \"\",\r\n" + 
				"  \"citizenNumIssued\": \"1996-09-06\",\r\n" + 
				"  \"nepCtzDate\": \"2063-05-08\",\r\n" + 
				"  \"panNepDate\": \"2072-08-06\",\r\n" + 
				"  \"address2Dist\": \"12562\",\r\n" + 
				"  \"telephone2\": null,\r\n" + 
				"  \"isMinor\": \"2\",\r\n" + 
				"  \"personalIdentyIssuedAuth\": \"2\",\r\n" + 
				"  \"personalIdentIssDate\": \"2017-05-02\",\r\n" + 
				"  \"passportIssuingAuthority\": \"2\",\r\n" + 
				"  \"citizenIssuingAuthority\": \"2\",\r\n" + 
				"  \"comRegNum\": \"2\",\r\n" + 
				"  \"comRegAuth\": \"2\",\r\n" + 
				"  \"accounts\": [\r\n" + 
				"    {\r\n" + 
				"      \"seqNo\": 4,\r\n" + 
				"      \"accountsRelatedPeople\": [\r\n" + 
				"        {\r\n" + 
				"          \"seqNo\": 203,\r\n" + 
				"          \"signSerNo\": \"DAWADI\",\r\n" + 
				"          \"addresses\": null,\r\n" + 
				"          \"identifications\": null,\r\n" + 
				"          \"relations\": null,\r\n" + 
				"          \"scountryCode\": null,\r\n" + 
				"          \"sisSignatory\": \"CHIEF ACCOUNTS & FINANCE\",\r\n" + 
				"          \"sisDirector\": \"T\",\r\n" + 
				"          \"swardNo\": \"KATHMANDU\",\r\n" + 
				"          \"scity\": null,\r\n" + 
				"          \"sstate\": null,\r\n" + 
				"          \"sphoneNo\": \"003\",\r\n" + 
				"          \"smobileNo\": \"Secondary\",\r\n" + 
				"          \"smotherName\": null,\r\n" + 
				"          \"sfathersName\": \"UMA DEVI DAWADI\",\r\n" + 
				"          \"sgmotherName\": \"JANAK PRASAD DAWADI\",\r\n" + 
				"          \"sgfathersName\": null,\r\n" + 
				"          \"sspouseName\": \"JANAK NATH DAWADI\",\r\n" + 
				"          \"sidExpNepDate\": null,\r\n" + 
				"          \"person_type\": \"Signatory\",\r\n" + 
				"          \"date_of_birth\": null,\r\n" + 
				"          \"date_of_birth_bs\": \"1922-07-26\",\r\n" + 
				"          \"first_name\": \"Shyam\",\r\n" + 
				"          \"middle_name\": \"ROSHAN\",\r\n" + 
				"          \"last_name\": null,\r\n" + 
				"          \"issuing_authority\": \"BIPANA DHITAL DAWADI\",\r\n" + 
				"          \"primary_identification_document_type\": \"Disctict Administration Office\",\r\n" + 
				"          \"primary_identification_document_no\": \"Citizenship         \",\r\n" + 
				"          \"issued_district\": \"7731                \",\r\n" + 
				"          \"issue_date\": \"028\",\r\n" + 
				"          \"issue_date_bs\": \"1999-01-06\",\r\n" + 
				"          \"expiry_date\": \"22/09/2055\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"seqNo\": 202,\r\n" + 
				"          \"signSerNo\": \"CHHETRI\",\r\n" + 
				"          \"addresses\": null,\r\n" + 
				"          \"identifications\": null,\r\n" + 
				"          \"relations\": null,\r\n" + 
				"          \"scountryCode\": null,\r\n" + 
				"          \"sisSignatory\": \"TEACHER\",\r\n" + 
				"          \"sisDirector\": null,\r\n" + 
				"          \"swardNo\": \"POKHARA\",\r\n" + 
				"          \"scity\": null,\r\n" + 
				"          \"sstate\": null,\r\n" + 
				"          \"sphoneNo\": \"004\",\r\n" + 
				"          \"smobileNo\": \"Primary\",\r\n" + 
				"          \"smotherName\": null,\r\n" + 
				"          \"sfathersName\": \"MAYA DEVI CHHETRI\",\r\n" + 
				"          \"sgmotherName\": \"GAMMAR BAHADUR CHHETRI\",\r\n" + 
				"          \"sgfathersName\": null,\r\n" + 
				"          \"sspouseName\": \"KARBIR CHHETRI\",\r\n" + 
				"          \"sidExpNepDate\": null,\r\n" + 
				"          \"person_type\": \"Signatory\",\r\n" + 
				"          \"date_of_birth\": null,\r\n" + 
				"          \"date_of_birth_bs\": \"1972-10-11\",\r\n" + 
				"          \"first_name\": \"Ram\",\r\n" + 
				"          \"middle_name\": \"DHAN\",\r\n" + 
				"          \"last_name\": \"BAHADUR\",\r\n" + 
				"          \"issuing_authority\": \"GANGA LAMICHHANE CHHETRI\",\r\n" + 
				"          \"primary_identification_document_type\": \"Disctict Administration Office\",\r\n" + 
				"          \"primary_identification_document_no\": \"Citizenship         \",\r\n" + 
				"          \"issued_district\": \"22118               \",\r\n" + 
				"          \"issue_date\": \"041\",\r\n" + 
				"          \"issue_date_bs\": \"1993-12-07\",\r\n" + 
				"          \"expiry_date\": \"22/08/2050\"\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"account_number\": \"1111111111111111111111111111111\",\r\n" + 
				"      \"sol_id\": null,\r\n" + 
				"      \"account_type\": \"\",\r\n" + 
				"      \"account_status_type\": null,\r\n" + 
				"      \"cy_code\": \"NPR\",\r\n" + 
				"      \"account_name\": \"new cbs account\",\r\n" + 
				"      \"is_dormant\": null,\r\n" + 
				"      \"is_blocked\": null,\r\n" + 
				"      \"is_special\": null,\r\n" + 
				"      \"account_open_date\": null,\r\n" + 
				"      \"last_transaction_date\": null\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"roAddress1\": \"2\",\r\n" + 
				"  \"roAddCountry\": \"2\",\r\n" + 
				"  \"roState\": \"2\",\r\n" + 
				"  \"roDistAdd\": \"015\",\r\n" + 
				"  \"roAddress2\": \"2\",\r\n" + 
				"  \"roAddress3\": \"2\",\r\n" + 
				"  \"roWardNo\": null,\r\n" + 
				"  \"typeOfBusinessDetail\": \"2\",\r\n" + 
				"  \"typeOfClient\": \"22\",\r\n" + 
				"  \"addresses\": [\r\n" + 
				"    {\r\n" + 
				"      \"address\": \"Kathmandu\",\r\n" + 
				"      \"district\": \"permanent district cbs new\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"contact\": \"permanent contact cbs new\",\r\n" + 
				"      \"city\": \"2\",\r\n" + 
				"      \"province\": \"Province 2\",\r\n" + 
				"      \"zone\": \"12562\",\r\n" + 
				"      \"address_type\": \"Permanent\",\r\n" + 
				"      \"ward_no\": \"2\",\r\n" + 
				"      \"mn_vdc\": \" pokhara\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"address\": \"66666666666666666666\",\r\n" + 
				"      \"district\": \"111111111111111111\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"contact\": \"33333333333333333333333333\",\r\n" + 
				"      \"city\": \"2\",\r\n" + 
				"      \"province\": \"Province 2\",\r\n" + 
				"      \"zone\": \"Mechi\",\r\n" + 
				"      \"address_type\": \"Communication\",\r\n" + 
				"      \"ward_no\": \"2\",\r\n" + 
				"      \"mn_vdc\": \"7777777777777\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"address\": \"2\",\r\n" + 
				"      \"district\": \"register district cbs new\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"contact\": \"register contact cbs new\",\r\n" + 
				"      \"city\": \"2\",\r\n" + 
				"      \"province\": \"Province 2\",\r\n" + 
				"      \"zone\": \"Solukhumbu\",\r\n" + 
				"      \"address_type\": \"Registered Address\",\r\n" + 
				"      \"ward_no\": null,\r\n" + 
				"      \"mn_vdc\": \"2\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"identifications\": [\r\n" + 
				"    {\r\n" + 
				"      \"primary_identification_document_type\": \"Citizenship\",\r\n" + 
				"      \"primary_identification_document_no\": \"55555555\",\r\n" + 
				"      \"issued_district\": \"chitwan\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"issue_date\": \"1996-09-06\",\r\n" + 
				"      \"issue_date_bs\": \"2063-05-08\",\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"issuing_authority\": \"District Administration Office\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"primary_identification_document_type\": \"Passport\",\r\n" + 
				"      \"primary_identification_document_no\": \"555555555\",\r\n" + 
				"      \"issued_district\": \"2\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"issue_date\": \"2017-05-02\",\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"expiry_date\": \"2030-05-06\",\r\n" + 
				"      \"issuing_authority\": \"Ministry of Foreign Affairs\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"relations\": [\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"\",\r\n" + 
				"      \"relation_type\": \"Spouse\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Sad Kumari Thapa\",\r\n" + 
				"      \"relation_type\": \"Grandmother\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Rabina Thapa\",\r\n" + 
				"      \"relation_type\": \"Daughter\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Rubina Thapa\",\r\n" + 
				"      \"relation_type\": \"Daughter\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Heena Thapa\",\r\n" + 
				"      \"relation_type\": \"Daughter-in-law\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Robert Thapa\",\r\n" + 
				"      \"relation_type\": \"Son\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Ful Kumari Thapa\",\r\n" + 
				"      \"relation_type\": \"Mother\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Harita Thapa\",\r\n" + 
				"      \"relation_type\": \"Daughter-in-law\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Happy Thapa\",\r\n" + 
				"      \"relation_type\": \"Grandfather\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Kumar Jung Thapa\",\r\n" + 
				"      \"relation_type\": \"Father-in-law\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"2\",\r\n" + 
				"      \"relation_type\": \"Spouse\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Rabin Thapa\",\r\n" + 
				"      \"relation_type\": \"Son\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"name\": \"Ful Kumar Thapa\",\r\n" + 
				"      \"relation_type\": \"Father\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"relatedPeople\": [\r\n" + 
				"    {\r\n" + 
				"      \"seqNo\": 3,\r\n" + 
				"      \"person_type\": \"Joint account holder\",\r\n" + 
				"      \"first_name\": \"jh\",\r\n" + 
				"      \"middle_name\": null,\r\n" + 
				"      \"last_name\": \"hb\",\r\n" + 
				"      \"primary_identification_document_type\": null,\r\n" + 
				"      \"primary_identification_document_no\": null,\r\n" + 
				"      \"issued_authority\": null,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"seqNo\": 2,\r\n" + 
				"      \"person_type\": \"Nominee\",\r\n" + 
				"      \"first_name\": \"l\",\r\n" + 
				"      \"middle_name\": \"l\",\r\n" + 
				"      \"last_name\": \"l\",\r\n" + 
				"      \"primary_identification_document_type\": \"n\",\r\n" + 
				"      \"primary_identification_document_no\": \"n\",\r\n" + 
				"      \"issued_authority\": \"n\",\r\n" + 
				"      \"issue_date_bs\": \"\",\r\n" + 
				"      \"issue_date\": \"\",\r\n" + 
				"      \"expiry_date\": \"\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"seqNo\": 2,\r\n" + 
				"      \"person_type\": \"Benefial Owner\",\r\n" + 
				"      \"first_name\": \"b\",\r\n" + 
				"      \"middle_name\": \"b\",\r\n" + 
				"      \"last_name\": \"b\",\r\n" + 
				"      \"primary_identification_document_type\": \"b\",\r\n" + 
				"      \"primary_identification_document_no\": \"b\",\r\n" + 
				"      \"issued_authority\": \"b\",\r\n" + 
				"      \"issue_date_bs\": \"\",\r\n" + 
				"      \"issue_date\": \"\",\r\n" + 
				"      \"expiry_date\": \"\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"involvements\": null,\r\n" + 
				"  \"registrations\": [\r\n" + 
				"    {\r\n" + 
				"      \"com_regd_num\": \"2\",\r\n" + 
				"      \"com_regd_auth\": \"2\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"gfathersName\": \"Happy Thapa\",\r\n" + 
				"  \"gmotherName\": \"Sad Kumari Thapa\",\r\n" + 
				"  \"pannumberIssDist\": \"2\",\r\n" + 
				"  \"pcity\": \"2\",\r\n" + 
				"  \"ccity\": \"2\",\r\n" + 
				"  \"pvdcMdc\": \"2\",\r\n" + 
				"  \"cvdcMdc\": \"2\",\r\n" + 
				"  \"pstate\": \"2\",\r\n" + 
				"  \"cstate\": \"2\",\r\n" + 
				"  \"cust_id\": \"11111111\",\r\n" + 
				"  \"first_name\": \"Sushil Acharya\",\r\n" + 
				"  \"f_name\": \"Sushil\",\r\n" + 
				"  \"m_name\": \"\",\r\n" + 
				"  \"l_name\": \"Acharya\",\r\n" + 
				"  \"date_of_birth\": \"1995-06-17\",\r\n" + 
				"  \"marital_status\": \"Single\",\r\n" + 
				"  \"pan_number\": \"55555\",\r\n" + 
				"  \"pan_number_issued\": \"1998-09-08\",\r\n" + 
				"  \"ownership\": \"001 Individual\",\r\n" + 
				"  \"branch_sol_id\": \"2\",\r\n" + 
				"  \"occupation_type\": \"support officer\",\r\n" + 
				"  \"business_description\": \"2\",\r\n" + 
				"  \"client_category\": \"Sole Proprietor\",\r\n" + 
				"  \"legal_customer_constitution\": \"PROPRIETORSHIP\",\r\n" + 
				"  \"natural_customer_constitution\": \"INDIVIDUAL\",\r\n" + 
				"  \"incorporation_state\": \"\",\r\n" + 
				"  \"incorporation_country\": \"2\"\r\n" + 
				"}";
		
		
		
		
		String kycJson = "{\r\n" + 
				"  \"personalInfo\": {\r\n" + 
				"    \"id\": 3058398,\r\n" + 
				"    \"salutation\": \"\",\r\n" + 
				"    \"first_name\": \"Sushil\",\r\n" + 
				"    \"middle_name\": \"\",\r\n" + 
				"    \"last_name\": \"Acharya\",\r\n" + 
				"    \"ls_title\": \"4543543\",\r\n" + 
				"    \"lsf_name\": \"asdasd\",\r\n" + 
				"    \"lsm_name\": \"asdasd\",\r\n" + 
				"    \"lsl_name\": \"asdasd\",\r\n" + 
				"    \"second_name\": \"\",\r\n" + 
				"    \"called_by_name\": \"\",\r\n" + 
				"    \"previous_name\": \"\",\r\n" + 
				"    \"date_of_birth\": \"1995-06-17\",\r\n" + 
				"    \"age\": \"25\",\r\n" + 
				"    \"notes\": \"\",\r\n" + 
				"    \"customer_type\": \"\",\r\n" + 
				"    \"customer_group\": \"INDIVIDUAL\",\r\n" + 
				"    \"customer_constitution\": \"INDIVIDUAL\",\r\n" + 
				"    \"customer_community\": \"\",\r\n" + 
				"    \"customer_caste\": \"\",\r\n" + 
				"    \"customer_employee_id\": \"\",\r\n" + 
				"    \"customer_open_date\": null,\r\n" + 
				"    \"customer_maker\": \"maker_kiran\",\r\n" + 
				"    \"gender\": \"Male\",\r\n" + 
				"    \"screening_id\": 624,\r\n" + 
				"    \"pan_number\": null,\r\n" + 
				"    \"minor\": false,\r\n" + 
				"    \"marital_status\": \"Single\",\r\n" + 
				"    \"customer_status_code\": \"\",\r\n" + 
				"    \"card_holder\": false,\r\n" + 
				"    \"non_resident_external\": false,\r\n" + 
				"    \"cust_id\": \"11111111\",\r\n" + 
				"    \"cbs_generated_name\": null,\r\n" + 
				"    \"deceased\": null,\r\n" + 
				"    \"date_of_deased\": null,\r\n" + 
				"    \"kycn_status\": null,\r\n" + 
				"    \"last_update_date\": null,\r\n" + 
				"    \"last_screened_date\": \"2020-07-05\",\r\n" + 
				"    \"verified_record\": false,\r\n" + 
				"    \"hash\": \"MZ53t5dwEStxlYh7LPkCdEW3bqE582vHRMQzSZvoXaHklcKeq43DysxuKI3dcrEQQqK8dabquKa/nYO1QeA0+nzzZNLl0iXmbqZL8jK3I7DVkBBOzg1TmIffx5HA1MIGVeURGF2Cr7wXLYGn2S4PaVG1GnBeT1E/TTY3yrP3vujaBL1neEnX1oGrs+nMCdv4NiAk8mILRQ4wt7je3R/FkIYawMw4n7VyJRjhHyn0jL45xZ4TbNysS6nF7LX1miWtDkuO+AzWsKsnyyvE44s2sCYgi/uB5He5R4G++PYglRdjKZJMsshnBmFF5gb4Izp203b3SH9SKalo4SenoLJ1Xqb41w==\",\r\n" + 
				"    \"read_only\": null,\r\n" + 
				"    \"active_user\": null,\r\n" + 
				"    \"branch_sol_id\": \"253\",\r\n" + 
				"    \"type\": \"Basic Information\",\r\n" + 
				"    \"cbs_import\": false,\r\n" + 
				"    \"risk_profiling\": false,\r\n" + 
				"    \"client_id\": null,\r\n" + 
				"    \"cif_code\": null,\r\n" + 
				"    \"limit_amt\": null,\r\n" + 
				"    \"old_client_code\": null,\r\n" + 
				"    \"nepali_date\": null,\r\n" + 
				"    \"alias\": null,\r\n" + 
				"    \"cbs_imported_date\": null,\r\n" + 
				"    \"is_updated\": true,\r\n" + 
				"    \"date_of_birth_bs\": \"2052-03-03\",\r\n" + 
				"    \"is_upadated_on_time\": false,\r\n" + 
				"    \"is_updated_on_time\": true,\r\n" + 
				"    \"duplicate\": true,\r\n" + 
				"    \"incomplete\": false,\r\n" + 
				"    \"goaml_gender_type\": \"\",\r\n" + 
				"    \"is_active\": true,\r\n" + 
				"    \"risk_value\": null,\r\n" + 
				"    \"risk_level\": null,\r\n" + 
				"    \"disabled\": null,\r\n" + 
				"    \"kyc_disabled_by\": null,\r\n" + 
				"    \"kyc_disable_timestamp\": null,\r\n" + 
				"    \"kyc_disabled_timestamp\": null,\r\n" + 
				"    \"modified_date\": \"2020-07-13T00:00:00\",\r\n" + 
				"    \"kyc_entry_date\": \"2020-07-05\",\r\n" + 
				"    \"is_simplified_kyc\": false,\r\n" + 
				"    \"is_primary\": true,\r\n" + 
				"    \"similarity\": null,\r\n" + 
				"    \"relation_removed_by\": null,\r\n" + 
				"    \"from_excel\": false,\r\n" + 
				"    \"martial_status\": null,\r\n" + 
				"    \"citizenship_no\": null,\r\n" + 
				"    \"father_first_name\": null,\r\n" + 
				"    \"father_last_name\": null,\r\n" + 
				"    \"father_middle_name\": null,\r\n" + 
				"    \"grandfather_first_name\": null,\r\n" + 
				"    \"grandfather_last_name\": null,\r\n" + 
				"    \"grandfather_middle_name\": null,\r\n" + 
				"    \"account_open_date\": null,\r\n" + 
				"    \"is_joint_venture\": false,\r\n" + 
				"    \"is_joint_account\": false,\r\n" + 
				"    \"occupation_type\": null,\r\n" + 
				"    \"kycn_created_date\": \"2020-07-05\"\r\n" + 
				"  },\r\n" + 
				"  \"addressInfo\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 3124830,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"address_type\": \"Communication\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"zone\": \"Gandaki\",\r\n" + 
				"      \"province\": \"111\",\r\n" + 
				"      \"district\": \"...............................\",\r\n" + 
				"      \"mn_vdc\": \"9860662247\",\r\n" + 
				"      \"pinzip\": \"\",\r\n" + 
				"      \"ward_number\": \"2\",\r\n" + 
				"      \"tole_area\": \"\",\r\n" + 
				"      \"street\": \"\",\r\n" + 
				"      \"house_no\": \"\",\r\n" + 
				"      \"unit_number\": \"\",\r\n" + 
				"      \"nearest_landmark\": \"\",\r\n" + 
				"      \"latitude\": \"\",\r\n" + 
				"      \"longitude\": \"\",\r\n" + 
				"      \"phone_no_country_code\": \"977\",\r\n" + 
				"      \"phone_no_area_code\": \"01\",\r\n" + 
				"      \"phone_no\": \"communication contact kyc\",\r\n" + 
				"      \"telex_no_country_code\": \"\",\r\n" + 
				"      \"telex_no_area_code\": \"\",\r\n" + 
				"      \"telex_no\": \"\",\r\n" + 
				"      \"pager_no_country_code\": \"\",\r\n" + 
				"      \"pager_no_area_code\": \"\",\r\n" + 
				"      \"pager_no\": \"\",\r\n" + 
				"      \"email_id\": \"sfsdf\",\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"state\": null,\r\n" + 
				"      \"ward_no\": null,\r\n" + 
				"      \"address\": \"9860662247\",\r\n" + 
				"      \"city\": \"2\",\r\n" + 
				"      \"goaml_country\": \"NP\",\r\n" + 
				"      \"goaml_address_type\": \"4\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 3124831,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"address_type\": \"Permanent\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"zone\": \"\",\r\n" + 
				"      \"province\": \"2\",\r\n" + 
				"      \"district\": \"permanent district kyc\",\r\n" + 
				"      \"mn_vdc\": \" pokhara\",\r\n" + 
				"      \"pinzip\": \"\",\r\n" + 
				"      \"ward_number\": \"2\",\r\n" + 
				"      \"tole_area\": \"\",\r\n" + 
				"      \"street\": \"\",\r\n" + 
				"      \"house_no\": \"\",\r\n" + 
				"      \"unit_number\": \"\",\r\n" + 
				"      \"nearest_landmark\": \"\",\r\n" + 
				"      \"latitude\": \"\",\r\n" + 
				"      \"longitude\": \"\",\r\n" + 
				"      \"phone_no_country_code\": \"977\",\r\n" + 
				"      \"phone_no_area_code\": \"01\",\r\n" + 
				"      \"phone_no\": \"permanent contact kyc\",\r\n" + 
				"      \"telex_no_country_code\": \"\",\r\n" + 
				"      \"telex_no_area_code\": \"\",\r\n" + 
				"      \"telex_no\": \"\",\r\n" + 
				"      \"pager_no_country_code\": \"\",\r\n" + 
				"      \"pager_no_area_code\": \"\",\r\n" + 
				"      \"pager_no\": \"\",\r\n" + 
				"      \"email_id\": \"\",\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"state\": null,\r\n" + 
				"      \"ward_no\": null,\r\n" + 
				"      \"address\": \"Kathmandu\",\r\n" + 
				"      \"city\": \"\",\r\n" + 
				"      \"goaml_country\": \"NP\",\r\n" + 
				"      \"goaml_address_type\": \"1\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 3124832,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"address_type\": \"Registered Address\",\r\n" + 
				"      \"country\": \"Nepal\",\r\n" + 
				"      \"zone\": \"\",\r\n" + 
				"      \"province\": \"\",\r\n" + 
				"      \"district\": \"adfafds\",\r\n" + 
				"      \"mn_vdc\": \"2\",\r\n" + 
				"      \"pinzip\": \"\",\r\n" + 
				"      \"ward_number\": \"\",\r\n" + 
				"      \"tole_area\": \"\",\r\n" + 
				"      \"street\": \"\",\r\n" + 
				"      \"house_no\": \"\",\r\n" + 
				"      \"unit_number\": \"\",\r\n" + 
				"      \"nearest_landmark\": \"\",\r\n" + 
				"      \"latitude\": \"\",\r\n" + 
				"      \"longitude\": \"\",\r\n" + 
				"      \"phone_no_country_code\": \"977\",\r\n" + 
				"      \"phone_no_area_code\": \"01\",\r\n" + 
				"      \"phone_no\": \"\",\r\n" + 
				"      \"telex_no_country_code\": \"\",\r\n" + 
				"      \"telex_no_area_code\": \"\",\r\n" + 
				"      \"telex_no\": \"\",\r\n" + 
				"      \"pager_no_country_code\": \"\",\r\n" + 
				"      \"pager_no_area_code\": \"\",\r\n" + 
				"      \"pager_no\": \"\",\r\n" + 
				"      \"email_id\": \"\",\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"state\": null,\r\n" + 
				"      \"ward_no\": null,\r\n" + 
				"      \"address\": \"2\",\r\n" + 
				"      \"city\": \"2\",\r\n" + 
				"      \"goaml_country\": \"NP\",\r\n" + 
				"      \"goaml_address_type\": \"2\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"familyInfo\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126912,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Spouse\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"abc\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126913,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Son\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Robert\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126914,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Daughter-in-law\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Harita\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126915,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Daughter\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Rabina\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126916,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Father\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Ful\",\r\n" + 
				"      \"middle_name\": \"Kumar\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126917,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Spouse\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"2\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126918,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Father-in-law\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Kumar\",\r\n" + 
				"      \"middle_name\": \"Jung\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126919,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Daughter-in-law\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Heena\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126920,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Son\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Rabin\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126921,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Daughter\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Rubina\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126922,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Mother\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Ful\",\r\n" + 
				"      \"middle_name\": \"Kumari\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126923,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Grandfather\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Happy\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2126924,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"relation_type\": \"Grandmother\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"relation_kyc_id\": null,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Sad\",\r\n" + 
				"      \"middle_name\": \"Kumari\",\r\n" + 
				"      \"last_name\": \"Thapa\",\r\n" + 
				"      \"lsf_name\": \"\",\r\n" + 
				"      \"lsm_name\": \"\",\r\n" + 
				"      \"lsl_name\": \"\",\r\n" + 
				"      \"second_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"primary_identification_document_no\": \"\",\r\n" + 
				"      \"relation_country\": \"\",\r\n" + 
				"      \"issuing_authority\": \"\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"issue_date_bs\": null\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"relatedPersonInfo\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 331387,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"person_type\": \"Nominee\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"kycn_id\": 3058482,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"l\",\r\n" + 
				"      \"middle_name\": \"l\",\r\n" + 
				"      \"last_name\": \"l\",\r\n" + 
				"      \"lsf_name\": null,\r\n" + 
				"      \"lsm_name\": null,\r\n" + 
				"      \"lsl_name\": null,\r\n" + 
				"      \"second_name\": null,\r\n" + 
				"      \"called_by_name\": null,\r\n" + 
				"      \"primary_identification_document_type\": null,\r\n" + 
				"      \"primary_identification_document_no\": null,\r\n" + 
				"      \"country\": null,\r\n" + 
				"      \"account_no\": null,\r\n" + 
				"      \"issuing_authority\": null,\r\n" + 
				"      \"place_of_issue\": null,\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": null,\r\n" + 
				"      \"goaml_person_type\": \"Z\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 331388,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"person_type\": \"Joint account holder\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"kycn_id\": 3058483,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"jh\",\r\n" + 
				"      \"middle_name\": \"\",\r\n" + 
				"      \"last_name\": \"hb\",\r\n" + 
				"      \"lsf_name\": null,\r\n" + 
				"      \"lsm_name\": null,\r\n" + 
				"      \"lsl_name\": null,\r\n" + 
				"      \"second_name\": null,\r\n" + 
				"      \"called_by_name\": null,\r\n" + 
				"      \"primary_identification_document_type\": null,\r\n" + 
				"      \"primary_identification_document_no\": null,\r\n" + 
				"      \"country\": null,\r\n" + 
				"      \"account_no\": null,\r\n" + 
				"      \"issuing_authority\": null,\r\n" + 
				"      \"place_of_issue\": null,\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": null,\r\n" + 
				"      \"goaml_person_type\": \"J\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 331389,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"person_type\": \"Benefial Owner\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"kycn_id\": 3058484,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"b\",\r\n" + 
				"      \"middle_name\": \"b\",\r\n" + 
				"      \"last_name\": \"b\",\r\n" + 
				"      \"lsf_name\": null,\r\n" + 
				"      \"lsm_name\": null,\r\n" + 
				"      \"lsl_name\": null,\r\n" + 
				"      \"second_name\": null,\r\n" + 
				"      \"called_by_name\": null,\r\n" + 
				"      \"primary_identification_document_type\": null,\r\n" + 
				"      \"primary_identification_document_no\": null,\r\n" + 
				"      \"country\": null,\r\n" + 
				"      \"account_no\": null,\r\n" + 
				"      \"issuing_authority\": null,\r\n" + 
				"      \"place_of_issue\": null,\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": null,\r\n" + 
				"      \"goaml_person_type\": \"UBO\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 331392,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"person_type\": \"Signatory\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"kycn_id\": 3058487,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Shyam\",\r\n" + 
				"      \"middle_name\": \"SURENDRA\",\r\n" + 
				"      \"last_name\": \"\",\r\n" + 
				"      \"lsf_name\": null,\r\n" + 
				"      \"lsm_name\": null,\r\n" + 
				"      \"lsl_name\": null,\r\n" + 
				"      \"second_name\": null,\r\n" + 
				"      \"called_by_name\": null,\r\n" + 
				"      \"primary_identification_document_type\": null,\r\n" + 
				"      \"primary_identification_document_no\": null,\r\n" + 
				"      \"country\": null,\r\n" + 
				"      \"account_no\": \"7899\",\r\n" + 
				"      \"issuing_authority\": null,\r\n" + 
				"      \"place_of_issue\": null,\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": null,\r\n" + 
				"      \"goaml_person_type\": \"\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 331393,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"person_type\": \"Signatory\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"kycn_id\": 3058488,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Ram\",\r\n" + 
				"      \"middle_name\": \"SUSHIL\",\r\n" + 
				"      \"last_name\": \"KUMAR\",\r\n" + 
				"      \"lsf_name\": null,\r\n" + 
				"      \"lsm_name\": null,\r\n" + 
				"      \"lsl_name\": null,\r\n" + 
				"      \"second_name\": null,\r\n" + 
				"      \"called_by_name\": null,\r\n" + 
				"      \"primary_identification_document_type\": null,\r\n" + 
				"      \"primary_identification_document_no\": null,\r\n" + 
				"      \"country\": null,\r\n" + 
				"      \"account_no\": \"7899\",\r\n" + 
				"      \"issuing_authority\": null,\r\n" + 
				"      \"place_of_issue\": null,\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": null,\r\n" + 
				"      \"goaml_person_type\": \"\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 331390,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"person_type\": \"Signatory\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"kycn_id\": 3058485,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Shyam\",\r\n" + 
				"      \"middle_name\": \"SURENDRA\",\r\n" + 
				"      \"last_name\": \"\",\r\n" + 
				"      \"lsf_name\": null,\r\n" + 
				"      \"lsm_name\": null,\r\n" + 
				"      \"lsl_name\": null,\r\n" + 
				"      \"second_name\": null,\r\n" + 
				"      \"called_by_name\": null,\r\n" + 
				"      \"primary_identification_document_type\": null,\r\n" + 
				"      \"primary_identification_document_no\": null,\r\n" + 
				"      \"country\": null,\r\n" + 
				"      \"account_no\": \"account number kyc \",\r\n" + 
				"      \"issuing_authority\": null,\r\n" + 
				"      \"place_of_issue\": null,\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": null,\r\n" + 
				"      \"goaml_person_type\": \"\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 331391,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"person_type\": \"Signatory\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"kycn_id\": 3058486,\r\n" + 
				"      \"salutation\": \"\",\r\n" + 
				"      \"first_name\": \"Ram\",\r\n" + 
				"      \"middle_name\": \"SUSHIL\",\r\n" + 
				"      \"last_name\": \"KUMAR\",\r\n" + 
				"      \"lsf_name\": null,\r\n" + 
				"      \"lsm_name\": null,\r\n" + 
				"      \"lsl_name\": null,\r\n" + 
				"      \"second_name\": null,\r\n" + 
				"      \"called_by_name\": null,\r\n" + 
				"      \"primary_identification_document_type\": null,\r\n" + 
				"      \"primary_identification_document_no\": null,\r\n" + 
				"      \"country\": null,\r\n" + 
				"      \"account_no\": \"00100200003485000012\",\r\n" + 
				"      \"issuing_authority\": null,\r\n" + 
				"      \"place_of_issue\": null,\r\n" + 
				"      \"issue_date\": null,\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"notes\": null,\r\n" + 
				"      \"goaml_person_type\": \"\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"relatedEntityInfo\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2145,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"person_type\": \"\",\r\n" + 
				"      \"cust_id\": \"\",\r\n" + 
				"      \"kycn_id\": null,\r\n" + 
				"      \"name\": \"\",\r\n" + 
				"      \"ls_name\": \"\",\r\n" + 
				"      \"called_by_name\": \"\",\r\n" + 
				"      \"primary_identification_document_type\": \"\",\r\n" + 
				"      \"registration_no\": \"\",\r\n" + 
				"      \"country\": \"\",\r\n" + 
				"      \"zone\": \"\",\r\n" + 
				"      \"province\": \"222\",\r\n" + 
				"      \"district\": \"\",\r\n" + 
				"      \"mn_vdc\": \"\",\r\n" + 
				"      \"pinzip\": \"\",\r\n" + 
				"      \"ward_number\": \"\",\r\n" + 
				"      \"tole_area\": \"\",\r\n" + 
				"      \"street\": \"\",\r\n" + 
				"      \"house_no\": \"\",\r\n" + 
				"      \"unit_number\": \"\",\r\n" + 
				"      \"nearest_landmark\": \"\",\r\n" + 
				"      \"latitude\": \"\",\r\n" + 
				"      \"longitude\": \"\",\r\n" + 
				"      \"phone_no_country_code\": \"977\",\r\n" + 
				"      \"phone_no_area_code\": \"01\",\r\n" + 
				"      \"phone_no\": \"\",\r\n" + 
				"      \"telex_no_area_code\": \"\",\r\n" + 
				"      \"telex_no_country_code\": \"\",\r\n" + 
				"      \"telex_no\": \"\",\r\n" + 
				"      \"email_id\": \"\",\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"kycl_id\": 306179\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"accountsCardsInfo\": null,\r\n" + 
				"  \"accountsServicesInfo \": null,\r\n" + 
				"  \"Financial info\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87719,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87720,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87721,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87722,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87723,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87724,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87725,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87726,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87729,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87730,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87731,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87732,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87733,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87734,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87735,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87736,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87739,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87740,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87741,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87742,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87743,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87744,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87745,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87746,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87747,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87748,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87749,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87750,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87751,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87752,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87753,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87754,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 87755,\r\n" + 
				"      \"currency_of_customer\": \"\",\r\n" + 
				"      \"pan_gir_of_customer\": \"222\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"individualCardsInfo\": null,\r\n" + 
				"  \"individualServicesInfo \": null,\r\n" + 
				"  \"identificationInfo\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2959627,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"primary_identification_document_type\": \"Citizenship\",\r\n" + 
				"      \"primary_identification_document_no\": \"55555555\",\r\n" + 
				"      \"country_of_issue\": \"Nepal\",\r\n" + 
				"      \"passport_no\": \"\",\r\n" + 
				"      \"passport_issuing_authority\": \"\",\r\n" + 
				"      \"passport_place_of_issue\": \"\",\r\n" + 
				"      \"passport_issue_date\": \"1996-09-06\",\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"visa_no\": \"\",\r\n" + 
				"      \"visa_expiry_date\": null,\r\n" + 
				"      \"nepal_entry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"goaml_type\": \"\",\r\n" + 
				"      \"goaml_country_of_issue\": \"NP\",\r\n" + 
				"      \"issuing_authority\": \"District Administration Office\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": \"1996-09-06\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2959628,\r\n" + 
				"      \"issue_date_bs\": null,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"primary_identification_document_type\": \"Passport\",\r\n" + 
				"      \"primary_identification_document_no\": \"555555555\",\r\n" + 
				"      \"country_of_issue\": \"Nepal\",\r\n" + 
				"      \"passport_no\": \"\",\r\n" + 
				"      \"passport_issuing_authority\": \"\",\r\n" + 
				"      \"passport_place_of_issue\": \"\",\r\n" + 
				"      \"passport_issue_date\": \"2017-05-02\",\r\n" + 
				"      \"expiry_date\": null,\r\n" + 
				"      \"visa_no\": \"\",\r\n" + 
				"      \"visa_expiry_date\": null,\r\n" + 
				"      \"nepal_entry_date\": null,\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"goaml_type\": \"\",\r\n" + 
				"      \"goaml_country_of_issue\": \"NP\",\r\n" + 
				"      \"issuing_authority\": \"Ministry of Foreign Affairs\",\r\n" + 
				"      \"place_of_issue\": \"\",\r\n" + 
				"      \"issue_date\": \"2017-05-02\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"involvementInfo\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 342888,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"kycl_id\": 0,\r\n" + 
				"      \"organization_nature\": \"\",\r\n" + 
				"      \"country\": \"Afghanistan\",\r\n" + 
				"      \"zone\": \"\",\r\n" + 
				"      \"province\": \"\",\r\n" + 
				"      \"district\": \"\",\r\n" + 
				"      \"mn_vdc\": \"\",\r\n" + 
				"      \"pinzip\": \"\",\r\n" + 
				"      \"involvement_ward_number\": \"\",\r\n" + 
				"      \"tole_area\": \"\",\r\n" + 
				"      \"street\": \"\",\r\n" + 
				"      \"house_no\": \"\",\r\n" + 
				"      \"unit_number\": \"\",\r\n" + 
				"      \"nearest_landmark\": \"\",\r\n" + 
				"      \"latitude\": \"\",\r\n" + 
				"      \"longitude\": \"\",\r\n" + 
				"      \"phone_no_country_code\": \"977\",\r\n" + 
				"      \"phone_no_area_code\": \"01\",\r\n" + 
				"      \"phone_no\": \"\",\r\n" + 
				"      \"fax_no\": \"\",\r\n" + 
				"      \"fax_no_country_code\": \"\",\r\n" + 
				"      \"fax_no_area_code\": \"\",\r\n" + 
				"      \"email_id\": \"\",\r\n" + 
				"      \"website\": \"\",\r\n" + 
				"      \"panvat\": \"\",\r\n" + 
				"      \"poboxno\": \"\",\r\n" + 
				"      \"nature\": null,\r\n" + 
				"      \"designation\": \"\",\r\n" + 
				"      \"start_date\": null,\r\n" + 
				"      \"end_date\": null,\r\n" + 
				"      \"involvement_notes\": \"\",\r\n" + 
				"      \"occupation_type\": \"\",\r\n" + 
				"      \"nature_of_involvement\": \"\",\r\n" + 
				"      \"organization_name\": \"\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"educationInfo\": null,\r\n" + 
				"  \"accountsInfo\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 4207925,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"branch_sol_id\": \"\",\r\n" + 
				"      \"scheme_description\": \"\",\r\n" + 
				"      \"account_id\": \"\",\r\n" + 
				"      \"for_account_id\": \"\",\r\n" + 
				"      \"currency_of_account\": \"NPR\",\r\n" + 
				"      \"customer_currency\": null,\r\n" + 
				"      \"customer_pan\": null,\r\n" + 
				"      \"account_no\": \"1111111111111111111111111111111\",\r\n" + 
				"      \"account_name\": \"\",\r\n" + 
				"      \"account_short_name\": \"\",\r\n" + 
				"      \"account_ownership\": \"\",\r\n" + 
				"      \"scheme_type\": \"\",\r\n" + 
				"      \"scheme_code\": \"\",\r\n" + 
				"      \"gl_sub_head_code\": \"\",\r\n" + 
				"      \"product_group\": \"\",\r\n" + 
				"      \"last_transaction_date\": null,\r\n" + 
				"      \"account_open_date\": null,\r\n" + 
				"      \"estimated_yearly_transactions\": null,\r\n" + 
				"      \"estimated_monthly_transactions\": null,\r\n" + 
				"      \"account_type\": \"\",\r\n" + 
				"      \"goaml_account_status_type\": \"\",\r\n" + 
				"      \"account_status_type\": \"\",\r\n" + 
				"      \"goaml_personal_account_type\": \"\",\r\n" + 
				"      \"estimated_yearly_turnover\": null,\r\n" + 
				"      \"estimated_monthly_turnover\": null,\r\n" + 
				"      \"regular_source_of_income\": \"\",\r\n" + 
				"      \"source_of_fund\": \"\",\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_blocked\": \"false\",\r\n" + 
				"      \"nature_of_account\": \"\",\r\n" + 
				"      \"removed_account_status\": null,\r\n" + 
				"      \"account_removed_by\": null,\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"is_joint_account\": false,\r\n" + 
				"      \"accounts_related_person\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": 331392,\r\n" + 
				"          \"issue_date_bs\": null,\r\n" + 
				"          \"salutation\": \"\",\r\n" + 
				"          \"person_type\": \"Signatory\",\r\n" + 
				"          \"cust_id\": \"\",\r\n" + 
				"          \"kycn_id\": 3058487,\r\n" + 
				"          \"first_name\": \"Shyam\",\r\n" + 
				"          \"middle_name\": \"SURENDRA\",\r\n" + 
				"          \"last_name\": \"\",\r\n" + 
				"          \"lsf_name\": null,\r\n" + 
				"          \"lsm_name\": null,\r\n" + 
				"          \"lsl_name\": null,\r\n" + 
				"          \"second_name\": null,\r\n" + 
				"          \"called_by_name\": null,\r\n" + 
				"          \"primary_identification_document_type\": null,\r\n" + 
				"          \"primary_identification_document_no\": null,\r\n" + 
				"          \"country\": null,\r\n" + 
				"          \"issuing_authority\": null,\r\n" + 
				"          \"place_of_issue\": null,\r\n" + 
				"          \"issue_date\": null,\r\n" + 
				"          \"expiry_date\": null,\r\n" + 
				"          \"notes\": null,\r\n" + 
				"          \"account_no\": \"7899\",\r\n" + 
				"          \"goaml_person_type\": \"\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": 331393,\r\n" + 
				"          \"issue_date_bs\": null,\r\n" + 
				"          \"salutation\": \"\",\r\n" + 
				"          \"person_type\": \"Signatory\",\r\n" + 
				"          \"cust_id\": \"\",\r\n" + 
				"          \"kycn_id\": 3058488,\r\n" + 
				"          \"first_name\": \"Ram\",\r\n" + 
				"          \"middle_name\": \"SUSHIL\",\r\n" + 
				"          \"last_name\": \"KUMAR\",\r\n" + 
				"          \"lsf_name\": null,\r\n" + 
				"          \"lsm_name\": null,\r\n" + 
				"          \"lsl_name\": null,\r\n" + 
				"          \"second_name\": null,\r\n" + 
				"          \"called_by_name\": null,\r\n" + 
				"          \"primary_identification_document_type\": null,\r\n" + 
				"          \"primary_identification_document_no\": null,\r\n" + 
				"          \"country\": null,\r\n" + 
				"          \"issuing_authority\": null,\r\n" + 
				"          \"place_of_issue\": null,\r\n" + 
				"          \"issue_date\": null,\r\n" + 
				"          \"expiry_date\": null,\r\n" + 
				"          \"notes\": null,\r\n" + 
				"          \"account_no\": \"7899\",\r\n" + 
				"          \"goaml_person_type\": \"\"\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"accounts_cards_subscribed\": null,\r\n" + 
				"      \"accounts_services_subscribed\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 4207924,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"branch_sol_id\": \"001\",\r\n" + 
				"      \"scheme_description\": \"\",\r\n" + 
				"      \"account_id\": \"\",\r\n" + 
				"      \"for_account_id\": \"\",\r\n" + 
				"      \"currency_of_account\": \"NPR\",\r\n" + 
				"      \"customer_currency\": null,\r\n" + 
				"      \"customer_pan\": null,\r\n" + 
				"      \"account_no\": \"\",\r\n" + 
				"      \"account_name\": \"\",\r\n" + 
				"      \"account_short_name\": \"\",\r\n" + 
				"      \"account_ownership\": \"\",\r\n" + 
				"      \"scheme_type\": \"\",\r\n" + 
				"      \"scheme_code\": \"\",\r\n" + 
				"      \"gl_sub_head_code\": \"\",\r\n" + 
				"      \"product_group\": \"\",\r\n" + 
				"      \"last_transaction_date\": null,\r\n" + 
				"      \"account_open_date\": null,\r\n" + 
				"      \"estimated_yearly_transactions\": null,\r\n" + 
				"      \"estimated_monthly_transactions\": null,\r\n" + 
				"      \"account_type\": \"\",\r\n" + 
				"      \"goaml_account_status_type\": \"\",\r\n" + 
				"      \"account_status_type\": \"\",\r\n" + 
				"      \"goaml_personal_account_type\": \"\",\r\n" + 
				"      \"estimated_yearly_turnover\": null,\r\n" + 
				"      \"estimated_monthly_turnover\": null,\r\n" + 
				"      \"regular_source_of_income\": \"\",\r\n" + 
				"      \"source_of_fund\": \"\",\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_blocked\": \"false\",\r\n" + 
				"      \"nature_of_account\": \"\",\r\n" + 
				"      \"removed_account_status\": null,\r\n" + 
				"      \"account_removed_by\": null,\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"is_joint_account\": false,\r\n" + 
				"      \"accounts_related_person\": null,\r\n" + 
				"      \"accounts_cards_subscribed\": null,\r\n" + 
				"      \"accounts_services_subscribed\": null\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 4207923,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"branch_sol_id\": \"001\",\r\n" + 
				"      \"scheme_description\": \"\",\r\n" + 
				"      \"account_id\": \"\",\r\n" + 
				"      \"for_account_id\": \"\",\r\n" + 
				"      \"currency_of_account\": \"NPR\",\r\n" + 
				"      \"customer_currency\": null,\r\n" + 
				"      \"customer_pan\": null,\r\n" + 
				"      \"account_no\": \"\",\r\n" + 
				"      \"account_name\": \"\",\r\n" + 
				"      \"account_short_name\": \"\",\r\n" + 
				"      \"account_ownership\": \"\",\r\n" + 
				"      \"scheme_type\": \"\",\r\n" + 
				"      \"scheme_code\": \"\",\r\n" + 
				"      \"gl_sub_head_code\": \"\",\r\n" + 
				"      \"product_group\": \"\",\r\n" + 
				"      \"last_transaction_date\": null,\r\n" + 
				"      \"account_open_date\": \"2018-05-03\",\r\n" + 
				"      \"estimated_yearly_transactions\": null,\r\n" + 
				"      \"estimated_monthly_transactions\": null,\r\n" + 
				"      \"account_type\": \"\",\r\n" + 
				"      \"goaml_account_status_type\": \"\",\r\n" + 
				"      \"account_status_type\": \"\",\r\n" + 
				"      \"goaml_personal_account_type\": \"\",\r\n" + 
				"      \"estimated_yearly_turnover\": null,\r\n" + 
				"      \"estimated_monthly_turnover\": null,\r\n" + 
				"      \"regular_source_of_income\": \"\",\r\n" + 
				"      \"source_of_fund\": \"\",\r\n" + 
				"      \"notes\": \"\",\r\n" + 
				"      \"is_blocked\": \"false\",\r\n" + 
				"      \"nature_of_account\": \"\",\r\n" + 
				"      \"removed_account_status\": null,\r\n" + 
				"      \"account_removed_by\": null,\r\n" + 
				"      \"is_active\": true,\r\n" + 
				"      \"is_joint_account\": false,\r\n" + 
				"      \"accounts_related_person\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": 331390,\r\n" + 
				"          \"issue_date_bs\": null,\r\n" + 
				"          \"salutation\": \"\",\r\n" + 
				"          \"person_type\": \"Signatory\",\r\n" + 
				"          \"cust_id\": \"\",\r\n" + 
				"          \"kycn_id\": 3058485,\r\n" + 
				"          \"first_name\": \"Shyam\",\r\n" + 
				"          \"middle_name\": \"SURENDRA\",\r\n" + 
				"          \"last_name\": \"\",\r\n" + 
				"          \"lsf_name\": null,\r\n" + 
				"          \"lsm_name\": null,\r\n" + 
				"          \"lsl_name\": null,\r\n" + 
				"          \"second_name\": null,\r\n" + 
				"          \"called_by_name\": null,\r\n" + 
				"          \"primary_identification_document_type\": null,\r\n" + 
				"          \"primary_identification_document_no\": null,\r\n" + 
				"          \"country\": null,\r\n" + 
				"          \"issuing_authority\": null,\r\n" + 
				"          \"place_of_issue\": null,\r\n" + 
				"          \"issue_date\": null,\r\n" + 
				"          \"expiry_date\": null,\r\n" + 
				"          \"notes\": null,\r\n" + 
				"          \"account_no\": \"00100200003485000012\",\r\n" + 
				"          \"goaml_person_type\": \"\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": 331391,\r\n" + 
				"          \"issue_date_bs\": null,\r\n" + 
				"          \"salutation\": \"\",\r\n" + 
				"          \"person_type\": \"Signatory\",\r\n" + 
				"          \"cust_id\": \"\",\r\n" + 
				"          \"kycn_id\": 3058486,\r\n" + 
				"          \"first_name\": \"Ram\",\r\n" + 
				"          \"middle_name\": \"SUSHIL\",\r\n" + 
				"          \"last_name\": \"KUMAR\",\r\n" + 
				"          \"lsf_name\": null,\r\n" + 
				"          \"lsm_name\": null,\r\n" + 
				"          \"lsl_name\": null,\r\n" + 
				"          \"second_name\": null,\r\n" + 
				"          \"called_by_name\": null,\r\n" + 
				"          \"primary_identification_document_type\": null,\r\n" + 
				"          \"primary_identification_document_no\": null,\r\n" + 
				"          \"country\": null,\r\n" + 
				"          \"issuing_authority\": null,\r\n" + 
				"          \"place_of_issue\": null,\r\n" + 
				"          \"issue_date\": null,\r\n" + 
				"          \"expiry_date\": null,\r\n" + 
				"          \"notes\": null,\r\n" + 
				"          \"account_no\": \"00100200003485000012\",\r\n" + 
				"          \"goaml_person_type\": \"\"\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"accounts_cards_subscribed\": null,\r\n" + 
				"      \"accounts_services_subscribed\": null\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"amlInfo\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 66014,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"fatca_country\": false,\r\n" + 
				"      \"us_non_us\": false,\r\n" + 
				"      \"risk_categorization\": \"\",\r\n" + 
				"      \"recommendations\": \"\",\r\n" + 
				"      \"aml_notes\": null,\r\n" + 
				"      \"aml_check\": false,\r\n" + 
				"      \"notes\": \"\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"internalObservation\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 66014,\r\n" + 
				"      \"kycn_personal_info_id\": 3058398,\r\n" + 
				"      \"observation_type\": \"\",\r\n" + 
				"      \"internal_observation_behavioral\": \"\",\r\n" + 
				"      \"internal_observation_financial\": \"\",\r\n" + 
				"      \"internal_observation_physical\": \"\",\r\n" + 
				"      \"internal_observation_connected_person\": \"\",\r\n" + 
				"      \"connected_person_id\": \"\",\r\n" + 
				"      \"connected_person\": null,\r\n" + 
				"      \"internal_observation_intended_objective_of_business_relation\": \"\",\r\n" + 
				"      \"observation_media_source\": \"\",\r\n" + 
				"      \"observation_date\": null,\r\n" + 
				"      \"observation_time\": \"\",\r\n" + 
				"      \"observed_by\": null,\r\n" + 
				"      \"notes\": \"\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"documentStatus\": null\r\n" + 
				"}";
		
		jsonUpdate.updateCBS(cbsJson,cbsNew,kycJson);
	}

}
