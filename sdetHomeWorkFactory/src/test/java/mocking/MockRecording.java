package mocking;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MockRecording {

	@Test
	public void record() {
		
	RestAssured.baseURI="http://localhost/api/now/table";
	//RestAssured.authentication=RestAssured.basic("admin","VQQp2wY7^j@r");
	RequestSpecification inputRequest = RestAssured.given()
    .queryParam("sysparm_fields", "sys_id,urgency,short_description,number");
	 Response response = inputRequest.get("/incident");
	 response.prettyPrint();
		
	}
}
