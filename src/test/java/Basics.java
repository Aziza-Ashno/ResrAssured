import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Basics {

	public static void main(String[] args) {
		
		// THIS IS A MODIFIED CODE FROM A TEAM LEAD ....
		
		// this is aziza code changes added...
		
		// TODO Auto-generated method stub
		
		//first requirement: Validate if Add Place API is working as expected
		
				//Given- all input details
				//when - Submit the API
				//Then - validate the response
				
				RestAssured.baseURI= "https://rahulshettyacademy.com";
				
				// for the given() we have to import the package manually import static io.restassured.RestAssured.*;
				given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body("{\r\n" + 
						"  \"location\": {\r\n" + 
						"    \"lat\": -38.383494,\r\n" + 
						"    \"lng\": 33.427362\r\n" + 
						"  },\r\n" + 
						"  \"accuracy\": 50,\r\n" + 
						"  \"name\": \"Aziza Alami\",\r\n" + 
						"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
						"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
						"  \"types\": [\r\n" + 
						"    \"shoe park\",\r\n" + 
						"    \"shop\"\r\n" + 
						"  ],\r\n" + 
						"  \"website\": \"https://rahulshettyacademy.com\",\r\n" + 
						"  \"language\": \"French-IN\"\r\n" + 
						"}\r\n" + 
						"").when().post("maps/api/place/add/json")
				.then().log().all().assertThat().statusCode(200);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
