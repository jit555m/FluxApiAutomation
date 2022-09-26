package AnotherPckg;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetDataStore {
	
	
	@Test
	public void GetDataSource()
	{
		given()
		 .accept(ContentType.JSON)
		 .param("type", "KafkaDataStore")
		 .param("config", "API_TC05")
		 .param("connectionId", "3")
	   .when()
		  .get("https://test-flux.internal.reports.mn/GetDataStoreFlows")
	   .then() 
		   .statusCode(200);
		  // .statusLine("HTTP/1.1 200 OK");
		   //.assertThat().body("type", equalTo("DruidDataStore"));
		
		
		
	}

}
