package petStore.com;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreatePetUsingHashMap {


	@Test

	public void createPet()
	{
		HashMap<String,Object> category= new HashMap<String,Object> ();

		category.put("id",202);
		category.put("name","cat");

		ArrayList<String>photoUrls = new ArrayList<String>();
		photoUrls.add("https://www.google.com");

		HashMap<String,Object> tag1= new HashMap<String,Object> ();
		tag1.put("id",22);
		tag1.put("name","xyz");

		ArrayList<HashMap<String,Object>> tags =new ArrayList<HashMap<String,Object>>();
		tags.add(tag1);

		HashMap<String,Object> json_body= new HashMap<String,Object> ();

		json_body.put("id", 0);
		json_body.put("name", "James");
		json_body.put("photoUrls", photoUrls);
		json_body.put("tags", tags);
		json_body.put("Status", "Available");

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
