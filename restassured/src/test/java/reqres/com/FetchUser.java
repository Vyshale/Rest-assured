package reqres.com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class FetchUser {
	
	@Test
	
	public void fetchAUser()
	{
		RestAssured.given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("https://reqres.in/api/users/2")
		
		.then().log().all();
	}

}
