package requestChaining;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreatePet 
{
	
	@Test
	public void creation()
	{
		File json_body = new File("./src/test/resources/createPet.properties");
		given()
		.contentType(ContentType.JSON)
		.body(json_body)
		
		.when()
		.post("https://petstore.swagger.io/v2/pet")
		
		.then().log().all();
	}

}
