package septemberPackage;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class GDS {
	
	  @Test
		 public void GetDS() {
		    	
				System.out.println("printing starts from here");
				RestAssured.baseURI="https://test-flux.internal.reports.mn";
				
				String response=given()
				.queryParam("type", "KafkaDataStore")
				.queryParam("config", "%7B%22topics%22%3A%22API_TC05%22%7D")
				.queryParam("connectionId", 3)
				.contentType(ContentType.JSON)
				  .accept(ContentType.JSON).
			   when()
			   .get("/GetDataStoreFlows").
			then()
			 .assertThat().statusCode(200).extract().response().asString();
				
				System.out.println("Response is "+response);
				JsonPath js=new JsonPath(response);
				//String topic=js.getString("type.config.topics");
				//System.out.println("Topic is"+topic);
				
			
		    	
		    }

}
