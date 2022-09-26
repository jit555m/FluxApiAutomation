package AnotherPckg;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GET01_Request {
	
/*	@Test
	public void GetDataSource()
	{
		given()
		 .accept(ContentType.JSON)
		 .param("type", "KafkaDataStore")
		 .param("config", "%7B%22topics%22%3A%22API_TC05%22%7D")
		 .param("connectionId", "3")
	   .when()
		  .get("https://test-flux.internal.reports.mn/GetDataStoreFlows")
	   .then() 
		   .statusCode(200);
		  // .statusLine("HTTP/1.1 200 OK");
		   //.assertThat().body("type", equalTo("DruidDataStore"));
		
		
		
	}*/
	
	@Test
	public void GDS2()
	{
		given()
		.when()
		  .get("https://reqres.in/api/users?page=2")
		.then()
		  .statusCode(200);
		
	}

}
