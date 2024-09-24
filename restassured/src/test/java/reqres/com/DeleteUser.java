package reqres.com;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteUser {

	@Test

	public void removeUser()
	{
		given()

		.when()
		.delete("https://reqres.in/api/users/2")

		.then()

		.log().all();
	}

}
