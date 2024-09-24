package payloadTypes;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Req_From_ExternalFile {
	
	@Test
	
	public void createUser()
	{
		File json_body = new File("C:\\Users\\User\\eclipse-workspace\\restassured\\src\\test\\resources\\createuser.json");
		
		given()
		.contentType(ContentType.JSON)
		.body(json_body)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.log()
		.all();
	}

}
