package AnotherPckg;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class CombinationGET {

	
	@Test
	public void GetDS2()
	{
		given()
		.when()
		  .get("https://reqres.in/api/users?page=2")
		.then()
		  .statusCode(200);
		
	}
}
