package petStore.com;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojo_package.Category;
import pojo_package.CreatePet;
import pojo_package.Tags;

public class CreatePetUsingPojo {
	
	
	
	@Test
	
	public void petCreation()
	{
		Category category = new Category(101,"Dog");
		
		ArrayList<String>photoUrls = new ArrayList<String>();
		photoUrls.add("https://www.shoppersstack.com/");
		
		Tags tag1 = new Tags(11, "ABC");
		
		ArrayList<Tags> tags = new ArrayList<Tags>();
		tags.add(tag1);
		
		CreatePet json_body = new CreatePet(0,category,"Goldy",photoUrls, tags, "Available");
		
		RestAssured
		.given()
		.contentType(ContentType.JSON)
		.body(json_body)
		
		.when()
		.post("https://petstore.swagger.io/v2/pet")
		
		.then()
		.log().all();
	}
	


}
