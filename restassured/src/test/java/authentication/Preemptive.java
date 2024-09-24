package authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Preemptive {

	@Test

	public void working()
	{
		RestAssured
		.given()
		.auth().preemptive().basic("student", "Password123")

		.when()
		.get("https://petstore.swagger.io/v2/user/login")

		.then().log().all();
	}

}
