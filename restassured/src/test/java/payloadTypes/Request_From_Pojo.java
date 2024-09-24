package payloadTypes;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojo_package.CreateUserkeys;

import static io.restassured.RestAssured.*;

public class Request_From_Pojo {

	
	@Test
	
	public void createuser()
	{
		CreateUserkeys userbody = new CreateUserkeys();
		
		userbody.setName("Vyshale");
		userbody.setJob("QA lead");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(userbody)
		
		.when().post("https://reqres.in/api/users")
		
		.then().log().all();
	}
}
