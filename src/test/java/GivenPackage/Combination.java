package GivenPackage;

import org.testng.annotations.Test;


import io.restassured.http.ContentType;	
	
import static io.restassured.RestAssured.*;	
import static org.hamcrest.Matchers.*;	

public class Combination {
	
	@Test
	public void CombinationMethod()
	{
		given()
		  .log().all()
		.when()
		  .get("https://test-flux.internal.reports.mn/ListEdgeInfo")
		.then()
		  .statusCode(200)
		  .log().all();
		
		
		
	}

}
