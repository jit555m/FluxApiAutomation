package septemberPackage;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class ADS {

	
	  @Test
	 public void GP() {
	    	
			System.out.println("printing starts from here");
			RestAssured.baseURI="https://test-flux.internal.reports.mn";
			
			String response=given()
			.contentType(ContentType.JSON)
			  .accept(ContentType.JSON) 
			  .body(payload.AddPlace()).
		   when()
		   .post("/AddDataStores").
		then()
		 .assertThat().statusCode(200).extract().response().asString();
			
			System.out.println("Response is "+response);
			JsonPath js=new JsonPath(response);
			//String topic=js.getString("type.config.topics");
			//System.out.println("Topic is"+topic);
			
		
	    	
	    }
}
