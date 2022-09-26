package JSONObjectPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Combination {
	
	@Test
	public void Comb() 
	{
		RestAssured.baseURI="https://test-flux.internal.reports.mn/ListEdgeInfo";
		
		// request object
		RequestSpecification rs=RestAssured.given();
		
		//response object
		Response res=rs.request(Method.GET);
		
		int statusCode=res.statusCode();
		System.out.println(statusCode);
		
	}

}
