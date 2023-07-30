package com.payment.payloads;

public class RequestPayloads 
{
	public static String AddRefundRecord()
	{
		return "{\r\n"
				+ "      \"account_no\": 7896745838,\r\n"
				+ "      \"name\": \"JOHN\",\r\n"
				+ "      \"refund_id\": \"TXN789674583801\",\r\n"
				+ "      \"refund_date\": \"2023-07-22T00:00:00Z\",\r\n"
				+ "      \"refund_cost\": 8000,\r\n"
				+ "      \"refund_status\": \"SUCCESS\",\r\n"
				+ "      \"purchase_cost\": 8000,\r\n"
				+ "      \"links\": [\r\n"
				+ "        {\r\n"
				+ "          \"rel\": \"self\",\r\n"
				+ "          \"href\": \"https://apex.oracle.com/pls/apex/apex_work_somu/refund_status/TXN789674583801\"\r\n"
				+ "        }\r\n"
				+ "      ]\r\n"
				+ "    }";
	}

}
