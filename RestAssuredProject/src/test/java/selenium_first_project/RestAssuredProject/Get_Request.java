package selenium_first_project.RestAssuredProject;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Request {
	
	@Test
	
	public void testcase( ) 
	{   
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(" http://localhost:3000/QATAR");
		System.out.println( "Status Code"  + res.getStatusCode());
		System.out.println("Response Data is");
		System.out.println(res.asString());
		
	}

}
