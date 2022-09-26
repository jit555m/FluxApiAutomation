package GivenPackage;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class GetDataStore {
	
	
	@Test
  
	public void GetDatastore()
	{
		
		
		given()
		  .param("type", "KafkaDataStore")
		  .param("config", "%7B%22topics%22%3A%22API_TC05%22%7D")
		  .param("connectionId", 3)
		.when()
		  .get("https://test-flux.internal.reports.mn/GetDataStoreFlows")
		.then()
		  // .statusCode(200)
		   .log().all();
	    
		  
	
	}

}
