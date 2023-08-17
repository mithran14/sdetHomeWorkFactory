package restAssured_learning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ServiceNow {
	

	
	
	@Test(enabled=false)
	public void bddGetAllincidents() 
	{
		RestAssured.baseURI="https://dev120880.service-now.com";
		RestAssured.authentication=RestAssured.basic("admin","VQQp2wY7^j@r");
		RequestSpecification spec = RestAssured.given();
		Response resp = spec.request(Method.GET, "/api/now/table/incident");	
		System.out.println(resp.asPrettyString());
		System.out.println(resp.getStatusLine());
	}

	@Test(enabled=false)
	public void postIncident() 
	{
		RestAssured.baseURI="https://dev120880.service-now.com/";
		RestAssured.authentication=RestAssured.basic("admin","VQQp2wY7^j@r");
		RequestSpecification spec = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"description\": \"via RestAssured Description Updated 07/08/2023 \",\r\n"
						+ "    \"short_description\": \"Updated via RestAssured 07/08/2023\"\r\n"
						+ "}");
		Response resp = spec.request(Method.POST, "api/now/table/incident");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.getStatusLine());
	}
	
	@Test(enabled=false)
	public void putIncident() 
	{
		RestAssured.baseURI="https://dev120880.service-now.com/";
		RestAssured.authentication=RestAssured.basic("admin","VQQp2wY7^j@r");
		RequestSpecification spec = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"description\": \"via RestAssured Description Updated PUT 07/08/2023 \",\r\n"
						+ "    \"short_description\": \"Updated via RestAssured PUT 07/08/2023\"\r\n"
						+ "}");
		Response resp = spec.request(Method.PUT, "api/now/table/incident/872e3ccd97a4b110aa6dbfb3f153afb8");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.getStatusLine());
	}
	
	@Test
	public void deleteIncident() 
	{
		RestAssured.baseURI="https://dev120880.service-now.com/";
		RestAssured.authentication=RestAssured.basic("admin","VQQp2wY7^j@r");
		RequestSpecification spec = RestAssured.given();
				
		Response resp = spec.request(Method.DELETE, "api/now/table/incident/872e3ccd97a4b110aa6dbfb3f153afb8");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.getStatusLine());
	}
}