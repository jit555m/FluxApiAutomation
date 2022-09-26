package DemoFluxAPIAutomation.DemoFluxAPIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetDataStore {
	
	@Test
	void GetDatastore()
	{
		// specify base URI
		
		RestAssured.baseURI="https://test-flux.internal.reports.mn";
		
		// request object
		RequestSpecification rs=RestAssured.given();
		
		//response object
		
	
		//Response res=rs.request(Method.GET,"/GetDataStoreFlows?type=KafkaDataStore&config=API_TC05&connectionId=3");
		
		given()
		  .param("type", "KafkaDataStore")
		  .param("config", "API_TC05")
		  .param("connectionId", 3)
		  
		
		  
		.when()
		  .get("https://test-flux.internal.reports.mn/GetDataStoreFlows")
		  .then()
		   .statusCode(200);
	    
		  
		//print response in console
		//String resbody=res.getBody().asString();
		//System.out.println("Response body is"+resbody);
		
		//status code validation
		//int StatusCode=res.getStatusCode();	
		//System.out.println("Status code is "+StatusCode);
	    
		
	}

}
