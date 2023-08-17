package restAssured_learning;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Jira {
	public static String ID;
	@BeforeMethod
	public void setUp() {
		// Set Endpoint
		RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2";
		RestAssured.authentication=RestAssured.preemptive().basic("Feb2023restAPI@gmail.com","ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		
	}
	
	@Test
	public void postIncident() 
	{
		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "        \"project\": {\r\n"
						+ "            \"key\": \"TES\"\r\n"
						+ "        },\r\n"
						+ "        \"summary\": \"create issue in RA project\",\r\n"
						+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
						+ "        \"issuetype\": {\r\n"
						+ "            \"name\": \"Bug\"\r\n"
						+ "        }\r\n"
						+ "    }\r\n"
						+ "}")
				.post("/issue");
		
		response.then().assertThat().statusCode(201);
		ID= response.jsonPath().get("result.id");
		System.out.println("System ID -----"+ID);
		//response.then().assertThat().body("result.self",Matchers.equalTo("atlassian"));
	}
	
	@Test()
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
	
	@Test
	public void deleteIncident() 
	{
		Response response = RestAssured.
				delete("/issue/"+ID);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code for Delete----------"+statusCode);
	
	}

}
