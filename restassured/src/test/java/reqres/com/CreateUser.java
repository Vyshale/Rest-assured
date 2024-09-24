package reqres.com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateUser {

	@Test

	public void createAUser()
	{
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(""
				+ "{\r\n"
				+ "    \"name\": \"vyshale\",\r\n"
				+ "    \"job\": \"QA lead\"\r\n"
				+ "}")
		.when()
		.post("https://reqres.in/api/users")

		.then().log().all();
	}

}
