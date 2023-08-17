package jira_RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends BaseClass {

	@Test(dependsOnMethods ="jira.UpdateIncident.putIncident") 
	public void delete() {
		
		
		Response response = RestAssured.
				delete("/issue/"+ID);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code for Delete----------"+statusCode);
		
		
		
		
		
		
	}
}
