package reqres.com;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class UpdateUser {
	
	@Test
	
	public void updateAUser()
	{
		given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"hello resident\"\r\n"
				+ "}")
		
		.when()
		.put("https://reqres.in/api/users/2")
		
		.then()
		.log().all();
	}

}
