package JSONObjectPackage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddDataStore {
	
	@Test
	public void ADS() 
	{
	RestAssured.baseURI="https://test-flux.internal.reports.mn/AddDataStores";
		
		// request object
		RequestSpecification rs=RestAssured.given();
		
		
		
		//response object
		Response res=rs.request(Method.POST);
		
	}

}
