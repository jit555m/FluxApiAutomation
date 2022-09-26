package AnotherPckg;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetToken {

	
	@Test
	public void tokenCreation()
	{
		given()
		  .body("{\r\n"
		  		+ "    \"username\" : \"admin\",\r\n"
		  		+ "    \"password\" : \"password123\"\r\n"
		  		+ "}")
		  .when()
		    .get("https://restful-booker.herokuapp.com/auth")
		  .then()
		    .statusCode(200);
	}
}
