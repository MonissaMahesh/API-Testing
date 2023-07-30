package com.refundapi.tests;


import java.util.concurrent.TimeUnit;
import io.restassured.http.*;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

@BeforeMethod
public class Smoke {
	public Response GetResp()
	{

       RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
       RequestSpecification httpRequest = RestAssured.given();
       Response resp = httpRequest.request(Method.GET,"");
       return resp;
	}
}
