package GivenPackage;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class SaveFlow {
	
	@Test
	public void SF() throws FileNotFoundException
	{
        FileInputStream fis = new FileInputStream (new File("C:\\Users\\jitesh.gh\\eclipse-workspace\\DemoFluxAPIAutomation\\JSONRequests\\Post2.json"));
		
		given().
		  body(fis).
		when().
		  post("https://test-flux.internal.reports.mn/SaveFlow").
		then().
		// statusCode(201).
		  log().all();
		
	}

}
