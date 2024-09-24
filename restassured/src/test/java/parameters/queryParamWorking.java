package parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class queryParamWorking {
	
	@Test
	
	public void working()
	{
		RestAssured
		.given()
		.queryParam("page", "2")
		
		.when()
		.get("https://reqres.in/api/users")
		
		.then()
		.log().all();
	}

}
