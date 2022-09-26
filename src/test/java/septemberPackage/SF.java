package septemberPackage;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class SF {
	
	     @Test
		 public void SaveFlow() {
		    	
				System.out.println("printing starts from here");
				RestAssured.baseURI="https://test-flux.internal.reports.mn";
				
				String response=given()
				.contentType(ContentType.JSON)
				  .accept(ContentType.JSON) 
				  .cookie("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhZE5hbWUiOiJqaXRlc2guZ2giLCJhZElkIjoiMTcwMDAifQ.xGnVHat1OOrAzjIi_ibq3Y1_P0zVdCL74t6KuxO5u-E")
				  .body(payload.SaveFlow()).
			   post("/SaveFlow").
			then()
			 .assertThat().statusCode(200).extract().response().asString();
				
				System.out.println("Response is "+response);
				JsonPath js=new JsonPath(response);
				//String topic=js.getString("type.config.topics");
				//System.out.println("Topic is"+topic);
				
			
		    	
		    }

}
