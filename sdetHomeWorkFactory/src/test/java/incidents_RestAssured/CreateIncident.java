package incidents_RestAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateIncident extends BaseClass{
	
	@Test
	public void create() {
		
		
		// Initiate request
		
		 RestAssured.given()
		.contentType("application/json");
		
		Response response = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\r\n"
				+ "    \"short_description\": \"Created via postman\"\r\n"
				+ "}")
		.post("/incident");
		
		//response.prettyPrint();
		
		response.then().assertThat().statusCode(200);
		response.then().assertThat().body("result.short_description",Matchers.equalTo("Created via postman"));
	
		// Extract Sys_id
		
		sys_ID= response.jsonPath().get("result.sys_id");
		System.out.println("System ID -----"+sys_ID);
		
		
		
		
		
	}

}
