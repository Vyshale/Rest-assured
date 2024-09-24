package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FormParameterWorking {
	
	
	@Test
	
	public void form()
	{
		given()
		.pathParam("petId", "9223372036854751638")
		.formParam("name", "Milo")
		.formParam("status", "inactive")
		
		.when()
		.post("https://petstore.swagger.io/v2/pet/{petId}")
		
		.then().log().all();
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("----------Fetching after Updating--------------");
		
		given()
		.pathParam("petId", "9223372036854751638")
		
		.when()
		.get("https://petstore.swagger.io/v2/pet/{petId}")
		
		.then().log().all();
		
	
	
	}

}
