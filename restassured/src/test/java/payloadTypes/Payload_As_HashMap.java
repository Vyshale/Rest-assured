package payloadTypes;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Payload_As_HashMap {
	
	@Test
	
	public void createUser()
	{
		
		HashMap<String, String> json_body = new HashMap<String, String>();
		json_body.put("name", "Alex");
		json_body.put("job", "QA Load");
		
		given()
		.body(json_body)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then().log().all();
	}

}
