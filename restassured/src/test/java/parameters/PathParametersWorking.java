package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParametersWorking {

	
	@Test
	
	public void path()
	{
		given()
		.pathParam("petId", "9223372036854758264")
		
		.when()
		.get("https://petstore.swagger.io/v2/pet/{petId}")
		
		.then()
		.log().all();
	}
}
