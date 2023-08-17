package pojo;

import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee {

	static String writeValueAsString ;

	@Test(priority=1)
	public void newadss() throws JsonProcessingException {

		POJO employee=new POJO();

		employee.setDescription("AADHIRAN 08/08/2023");
		employee.setShort_description("AADHIRAN 08/08/2023");
		//employee.setSkills(Arrays.asList("Selenium","JAVA"));

		System.out.println(employee.getDescription());
		System.out.println(employee.getShort_description());
		//System.out.println(employee.getSkills());

		ObjectMapper mapper=new ObjectMapper();
		writeValueAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(writeValueAsString);
	}

	@Test(priority=2)
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
		.body(writeValueAsString)
		.when()
		.post("api/now/table/incident")
		.prettyPrint();
		//System.out.println(jsonBody);
	}
}
