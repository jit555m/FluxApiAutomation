package GivenPackage;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class AddDataStore {
	
	/*
    @Test	
	public void ADS() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream (new File("C:\\Users\\jitesh.gh\\eclipse-workspace\\DemoFluxAPIAutomation\\JSONRequests\\Post.json"));
		System.out.println("printing starts from here");
		System.out.println(fis);
		
		given()
		  .contentType("application/json")
		  .body(fis).
		  
		when().
		  post("https://reqres.in/api/users").
		then().
		  statusCode(201)
		  .log().all();
	}*/
    
    @Test
    public void GP() {
    	
		
		System.out.println("printing starts from here");
		
		
		String response=given()
		.contentType(ContentType.JSON)
		  .accept(ContentType.JSON) 
		  .body("{\r\n"
		  		+ "    \"flowName\": \"API_tc03\",\r\n"
		  		+ "    \"developers\": \"keval.k\",\r\n"
		  		+ "    \"reviewers\": \"adit.s,ankit.mis,ankur.y,balakarthikeyan.r,hande.s,hemali.d,nitish.sha,surya.s,umang.s\",\r\n"
		  		+ "    \"mode\": \"EDIT\",\r\n"
		  		+ "    \"datastoreList\": [\r\n"
		  		+ "        {\r\n"
		  		+ "            \"type\": \"DruidDataStore\",\r\n"
		  		+ "            \"connectionId\": 10,\r\n"
		  		+ "            \"uId\": 998,\r\n"
		  		+ "            \"config\": {\r\n"
		  		+ "                \"Server\": \"http://c8-auto-druid-staging-2.srv.media.net:8090\",\r\n"
		  		+ "                \"Indexer\": \"http://172.16.200.30:10141\",\r\n"
		  		+ "                \"Broker\": \"http://c8-auto-druid-staging-2.srv.media.net:8082\",\r\n"
		  		+ "                \"dataSource\": \"API_tc03\",\r\n"
		  		+ "                \"dm_source\": \"None\",\r\n"
		  		+ "                \"enable_compaction\": \"false\"\r\n"
		  		+ "            },\r\n"
		  		+ "            \"forceUpdate\": false,\r\n"
		  		+ "            \"id\": 998\r\n"
		  		+ "        },\r\n"
		  		+ "        {\r\n"
		  		+ "            \"type\": \"KafkaDataStore\",\r\n"
		  		+ "            \"connectionId\": 3,\r\n"
		  		+ "            \"uId\": 997,\r\n"
		  		+ "            \"config\": {\r\n"
		  		+ "                \"bootStrapServer\": \"172.16.201.187:9092,172.16.201.188:9092,172.16.201.189:9092\",\r\n"
		  		+ "                \"topics\": \"API_tc03\",\r\n"
		  		+ "                \"use_regex\": \"0\",\r\n"
		  		+ "                \"is_active\": \"0\",\r\n"
		  		+ "                \"source\": \"\",\r\n"
		  		+ "                \"maxOffsetsPerTrigger\": \"1000000\",\r\n"
		  		+ "                \"output_column_format\": \"yyyyMMddHH\",\r\n"
		  		+ "                \"pool_id\": \"2\",\r\n"
		  		+ "                \"parser_class\": \"net.media.spark.util.JsonDataFrameParser\",\r\n"
		  		+ "                \"startingOffsets\": \"latest\",\r\n"
		  		+ "                \"input_column_key\": \"\",\r\n"
		  		+ "                \"input_column_format\": \"yyyy-MM-dd HH:mm:ss\",\r\n"
		  		+ "                \"raven_schema_id\": \"none\"\r\n"
		  		+ "            },\r\n"
		  		+ "            \"forceUpdate\": false,\r\n"
		  		+ "            \"id\": 997\r\n"
		  		+ "        }\r\n"
		  		+ "    ]\r\n"
		  		+ "}").
	   when().
		  post("https://reqres.in/api/users").
	then().
      statusCode(201).
	  extract().response().asString();
		
		
		System.out.println("Response is "+response);
		
	
    	
    }

}
