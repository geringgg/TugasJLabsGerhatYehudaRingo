package com.TugasLima;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TugasLima {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com")
			.setContentType(ContentType.JSON).build().log().all();
	RequestSpecification loginJsonSpec;
	String token;

	@Test(priority = 1) // ini manual input usernya
	public void Register() {
		String registerPayload = "{\"username\": \"gerhat1717\", "
				+ "\"password\": \"gerhat1717\","
				+ "\"email\": \"gerhat1717@ringo.com\","
				+ "\"phonenumber\":\"080989999\"}";;
		Response responseRegister = given().spec(commonJsonSpec).body(registerPayload).when().post("/register");
		assertEquals(responseRegister.getStatusCode(), 400);
	}
	
	@Test(priority = 2) //ini random generate usernya
	public void RegisterKolakFaker() {
		Faker faker = new Faker();
		String username = faker.name().fullName();
		//long password = faker.number().randomNumber();
		String email = faker.internet().emailAddress();
		String phonenumber = faker.phoneNumber().phoneNumber();
		
		String registerPayload = 
				"{\"username\":"+"\"" +username+ "\""+","
				+ "\"password\": \"inipasswordygy\","
				+ "\"email\":"+"\"" +email+ "\""+","
				+ "\"phonenumber\":"+"\"" +phonenumber+ "\""+"}";;
				Response responseRegister = given().spec(commonJsonSpec).body(registerPayload).when().post("/register");
				assertEquals(responseRegister.getStatusCode(), 201);
	}

}