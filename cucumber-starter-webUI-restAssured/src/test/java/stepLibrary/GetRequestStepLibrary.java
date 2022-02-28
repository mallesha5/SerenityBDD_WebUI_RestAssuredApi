package stepLibrary;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class GetRequestStepLibrary {
	
	int respStatusCode = 0;
	
	@Step
	public void submitRequestPost(String req) {
		
		
		RestAssured.useRelaxedHTTPSValidation();
		RequestSpecification request = RestAssured.given();
		Response response = null;
		
		request.header("Content-type", "application/json");
		request.body(req);
		response = request.post("https://jsonplaceholder.typicode.com/posts");
		respStatusCode = response.getStatusCode();
		System.out.println("the response status code is : "+respStatusCode);
		System.out.println("the response is : ");
		response.prettyPrint();
		
		Serenity.recordReportData().withTitle("Request-Response").andContents("The request is: \n-------------------\n\n"+req+"\n\nThe response is: \n-------------------\n\n"+response.prettyPrint());

	
	}
	
	@Step
	public void submitRequestGet() {
			
			
			RestAssured.useRelaxedHTTPSValidation();
			RequestSpecification request = RestAssured.given();
			Response response = null;
			
			response = request.get("http://api.openweathermap.org/data/2.5/weather?q=mumbai&appid=6de6de5953c17abf2816359675f8ccb0");
			respStatusCode = response.getStatusCode();
			System.out.println("the response status code is : "+respStatusCode);
			System.out.println("the response is : ");
			response.prettyPrint();
			
			Serenity.recordReportData().withTitle("Request-Response").andContents("The request is: \n-------------------\n\nNo Request body for Get()\n\nThe response is: \n-------------------\n\n"+response.prettyPrint());
		
		}
	
	@Step
	public int getResponseStatusCode() {
		return respStatusCode;
	}

}
