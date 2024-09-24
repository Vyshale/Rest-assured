package responseValidation;

import static org.hamcrest.Matcher.*;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;



import io.restassured.RestAssured;

public class ResponseValidationPart1 {
	
	@Test
	
	public void response() {
		
		RestAssured
		.given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.assertThat()
		.statusCode(200)
		.statusLine(Matchers.containsString("OK"))
		.time(Matchers.lessThanOrEqualTo(5000L))
		.header("Server", Matchers.equalTo("cloudflare"))
		.header("Content-Type",Matchers.containsStringIgnoringCase("application/JSON"))
		.body("page",Matchers.equalTo(2))
		//.body("data[4].first_name", Matchers.equalTo("george"))
		.log()
		.all();
		
	}
  


}
