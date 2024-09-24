package payloadTypes;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojo_package.UserKeyCreationUsingCons;

public class RequestFromPojo2 {
	
	@Test
	 public void userCreation()
	 {
		UserKeyCreationUsingCons userbody = new UserKeyCreationUsingCons("Vyshale","QA Lead");
		
		given()
		.contentType(ContentType.JSON)
		.body(userbody)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then().log().all();
		
	
	 }

}
