package petStore.com;

import java.util.ArrayList;
import java.util.Collection;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojo_package.WishListObject;
import pojo_package.createUserWishlist;

public class CreateWishList {

	@SuppressWarnings("unchecked")
	@Test
	public void creation()
	{

		createUserWishlist addingDets = new createUserWishlist(0, "vysh", "Vyshale","S", "vysh@gmail.com", "Password@123", "9147852142", "0");

//		ArrayList<WishListObject> wish = new ArrayList<WishListObject>();
//		wish.addAll((Collection<? extends WishListObject>) addingDets);


		ArrayList<Object> data=new ArrayList<Object>();
		 data.add(0, addingDets);
		
		RestAssured
		.given().log().all()
		.contentType(ContentType.JSON)
		.body(data)

		.when()
		.post("https://petstore.swagger.io/v2/user/createWithList")

		.then()
		.log().all();		

	}

}
