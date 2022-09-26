package DemoFluxAPIAutomation.DemoFluxAPIAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SaveFlow {
	
	@Test
	void SaveFlow()
	{
		// specify base URI
		
		RestAssured.baseURI="https://test-flux.internal.reports.mn";
		
		// request object
		RequestSpecification rs=RestAssured.given();
		
		//response object
		Response res=rs.request(Method.POST,"/SaveFlow");
		
		//print response in console
		String resbody=res.getBody().asString();
		System.out.println("Response body is"+resbody);
		
		//status code validation
		int StatusCode=res.getStatusCode();	
		System.out.println("Status code is "+StatusCode);
	    
		
	}

}
