package parameters;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class FileUploadPractice {
	
	@Test
	
	public void working()
	{
		
		
		
		File imagePassing = new File("./src/test/resources/Images/milo.jfif");
		
		RestAssured 
		.given()
		.multiPart(imagePassing)
		.pathParam("petId", "9223372036854751638")
		
		.when()
		.post("https://petstore.swagger.io/v2/pet/{petId}/uploadImage")
		
		.then()
		.log()
		.all();
		
		
		
	}

}
