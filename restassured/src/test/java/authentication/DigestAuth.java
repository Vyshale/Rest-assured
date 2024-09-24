package authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DigestAuth {

	
	@Test
	
	public void working()
	{
		RestAssured
		.given()
		.auth().digest("student", "Password123")

		.when()
		.get("https://petstore.swagger.io/v2/user/login")
		
		.then().log().all();
	}
}
