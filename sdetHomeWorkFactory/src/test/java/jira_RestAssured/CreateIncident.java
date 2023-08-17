package jira_RestAssured;


import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateIncident extends BaseClass{
	
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
		
		response.then().assertThat().statusCode(200);
		ID= response.jsonPath().get("id");
		System.out.println("System ID -----"+ID);
		response.then().assertThat().body("self",Matchers.equalTo("https://testjirafeb2023.atlassian.net/rest/api/2/issue/"+ID));
		response.then().assertThat().body("self", Matchers.containsString("atlassian"));
	}

}
