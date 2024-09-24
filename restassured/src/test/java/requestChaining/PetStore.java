package requestChaining;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class PetStore {
	
	public long petId;
	
	@Test()
	public void createPet()
	{
		
		File json_body=new File("./src/test/resources/createuser.json");
		given()
		.contentType(ContentType.JSON)
		.body(json_body)
		
		.when()
		.post("https://petstore.swagger.io/v2/pet")
		
		.then().log().all();
	}
	
	@Test(dependsOnMethods = "createPet")
	public void updatePet()
	{
		given()
		.contentType(ContentType.JSON)
		.pathParam("petId", petId)
		.formParam("name", "Scooby Doo")
		.formParam("status", "Sold Out")
		
	.when()
	.post("https://petstore.swagger.io/v2/pet/{petId}")
	
	.then().log().all();
	}
	
	@Test(dependsOnMethods = "updatePet")
	public void fetchPet()
	{
		given()
		.pathParam("petId", petId)
		
		.when()
		.get("https://petstore.swagger.io/v2/pet/{petId}")
		
		.then().log().all();

	}
	
	@Test(dependsOnMethods = "fetchPet")
	
	public void deletePet()
	{
		given()
		.pathParam("petId", petId)
		
		.when()
		.delete("https://petstore.swagger.io/v2/pet/{petId}")
		
		.then().log().all();
	}

}
