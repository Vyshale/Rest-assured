package responseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseValidation2 {

	@Test

	public void validation()
	{

		String emailId = "";
		Response response =  given()

				.when()
				.get("https://reqres.in/api/users?page=2");

		int numberOfUsers=	response.jsonPath().getInt("data.size");

		for(int i = 0; i < numberOfUsers;i++)
		{
			String userName = 	response.jsonPath().getString("data["+i+"].first_name");

			if(userName.equalsIgnoreCase("Lindsay"))
			{
				emailId= response.jsonPath().getString("data["+i+"].email");

				break;
			}

		}


		System.out.println(emailId);

	}

}
