package DemoFluxAPIAutomation.DemoFluxAPIAutomation;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddDataStore {
	

		
		@Test
		void AddDatastore() throws FileNotFoundException
		{
			
			FileInputStream fis = new FileInputStream (new File("C:\\Users\\jitesh.gh\\eclipse-workspace\\DemoFluxAPIAutomation\\JSONRequests\\Post.json"));
			
			// specify base URI
			
			RestAssured.baseURI="https://test-flux.internal.reports.mn";
			
			// request object
			RequestSpecification rs=RestAssured.given();
			
			//response object
			//Response res=rs.request(Method.POST,"/AddDataStores");
			
			given().
			  body(fis).
			when().
			  post("https://reqres.in/api/users").
			then().
			  statusCode(201);
			
			
			
			//print response in console
			/*String resbody=res.getBody().asString();
			System.out.println("Response body is"+resbody);
			
			//status code validation
			int StatusCode=res.getStatusCode();	
			System.out.println("Status code is "+StatusCode);*/
		    
			
		}


}
