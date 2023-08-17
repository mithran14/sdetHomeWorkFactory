package restAssured_learning;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Bdd_style 
{

	@Test(enabled=false)
	public void getAllincidents() 
	{
		given()
		.auth()
		.basic("admin","VQQp2wY7^j@r")
		.baseUri("https://dev120880.service-now.com")
		.when()
		.get("/api/now/table/incident")
		.prettyPrint();
		
	}
	@Test(enabled=false)
	public void postIncident() 
	{
		
		given()
			.auth()
			.basic("admin","VQQp2wY7^j@r")
			.baseUri("https://dev120880.service-now.com/")
			.header("Content-Type","application/json")
			.body("{\r\n"
						+ "    \"description\": \"via RestAssured BDD Description Updated 07/08/2023 \",\r\n"
						+ "    \"short_description\": \"Updated via RestAssured BDD 07/08/2023\"\r\n"
						+ "}")
		.when()
			.post("api/now/table/incident")
			.prettyPrint();
	
	}
	@Test(enabled=false)
	public void putIncident() 
	{
		given()
			.auth()
			.basic("admin","VQQp2wY7^j@r")
			.baseUri("https://dev120880.service-now.com/")
			.header("Content-Type","application/json")
			.body("{\r\n"
						+ "    \"description\": \"via RestAssured RECENTBDD Description Updated 07/08/2023 \",\r\n"
						+ "    \"short_description\": \"Updated via RestAssured RECENTBDD 07/08/2023\"\r\n"
						+ "}")
		.when()
			.put("api/now/table/incident/6308a5859768b110aa6dbfb3f153af3a")
			.prettyPrint();
	
	}
	@Test(enabled=false)
	public void deleteIncident() 
	{
		given()
		.auth()
		.basic("admin","VQQp2wY7^j@r")
		.baseUri("https://dev120880.service-now.com/")
	.when()
		.delete("api/now/table/incident/6308a5859768b110aa6dbfb3f153af3a")
		.prettyPrint();
	}
	@Test(enabled=false)
	public void postIncidentWithJSON() 
	{
		File json=new File("incident1.json");
		given()
			.auth()
			.basic("admin","VQQp2wY7^j@r")
			.baseUri("https://dev120880.service-now.com/")
			.header("Content-Type","application/json")
			.body(json)		
			.when()
			.post("api/now/table/incident")
			.prettyPrint();
	}
	
	@Test()
	public void serialization() 
	{
		
		Map<String, String> jsonBody=new HashMap<String, String>();
		jsonBody.put("description", "Like MARI VIGNESH SDET 08/08/2023");
		jsonBody.put("short_description", "Like MARI VIGNESH SDET 08/08/2023");
		
		
		List<String> list=new ArrayList<String>();
		list.add("Selenium");
		list.add("Api");
		//jsonBody.put("Skills", list);
		
		given()
		.auth()
		.basic("admin","VQQp2wY7^j@r")
		.baseUri("https://dev120880.service-now.com/")
		.header("Content-Type","application/json")
		.body(jsonBody)
	.when()
		.post("api/now/table/incident")
		.prettyPrint();
		//System.out.println(jsonBody);
		
	}
}
