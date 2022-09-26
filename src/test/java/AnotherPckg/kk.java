package AnotherPckg;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class kk {


		

			
			@Test
			void AddDatastore(Object httpRequest)
			{
				// specify base URI
				
				RestAssured.baseURI="https://flux.internal.reports.mn/AddDataStores";
				
				// request object
				RequestSpecification rs=RestAssured.given();
				
				//response object
				JSONObject requestParams=new JSONObject();
				
				requestParams.put("type", "KafkaDataStore");
				requestParams.put("connectionId", "3");
				requestParams.put("topics", "analytics_events");
				requestParams.put("type", "HdfsDataStore");
				requestParams.put("connectionId", "1");
				requestParams.put("path", "/user/hive/warehouse/misc.db/analytics_events_qa1/");
				
				rs.header("Content-Type","application/JSON");
				rs.body(requestParams.toJSONString());
				
				
				Response res=rs.request(Method.POST,"/AddDataStores");
				
				
				//print response in console
				String resbody=res.getBody().asString();
				System.out.println("Response body is"+resbody);
				
				//status code validation
				int StatusCode=res.getStatusCode();	
				System.out.println("Status code is "+StatusCode);
			    
				
			}


	}



