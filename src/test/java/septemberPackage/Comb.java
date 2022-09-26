package septemberPackage;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Comb {
	
	     @Test
		 public void Combi() {
		    	
				System.out.println("printing starts from here");
				RestAssured.baseURI="https://test-flux.internal.reports.mn";
				
				String response=given()
						.contentType(ContentType.JSON)
						  .accept(ContentType.JSON) 
			 .when()
			   .get("/ListEdgeInfo").
			then()
			 .assertThat().statusCode(200).extract().response().asString();
				
				System.out.println("Response is "+response);
				//JsonPath js=new JsonPath(response);
				//String topic=js.getString("type.config.topics");
				//System.out.println("Topic is"+topic);
				
			
		    	
		    }

}
