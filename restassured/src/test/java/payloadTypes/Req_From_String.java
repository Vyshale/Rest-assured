package payloadTypes;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Req_From_String {
	
	@Test
	public void CreateUser()
	{
		given()
		.contentType(ContentType.JSON)
		.body(PayloadAsString.createUser())
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then().log().all();
	}

}
