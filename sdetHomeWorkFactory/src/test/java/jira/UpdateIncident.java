package jira;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateIncident extends BaseClass {
    
	@Test(dependsOnMethods ="jira.CreateIncident.postIncident")   
	//packagename.classname.methodname
	public void putIncident() 
	{
		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
						+ "    }\r\n"
						+ "}")
				.put("/issue/"+ID);
		
		response.then().assertThat().statusCode(204);
	}
}
