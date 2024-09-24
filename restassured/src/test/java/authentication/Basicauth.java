package authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Basicauth {
	
	@Test
	
	public void auth1()
	{
		RestAssured.given().auth().basic("student", "Password123")
		
		.when()
		.get("https://petstore.swagger.io/v2/user/login")
		
		.then().log().all();
	}

}
