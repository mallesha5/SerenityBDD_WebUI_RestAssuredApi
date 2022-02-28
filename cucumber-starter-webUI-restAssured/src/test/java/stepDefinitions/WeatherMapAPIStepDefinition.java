package stepDefinitions;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import stepLibrary.GetRequestStepLibrary;

public class WeatherMapAPIStepDefinition {
	
	@Steps
	GetRequestStepLibrary stepLibrary;
	
	@Given("The user submits the GET request for weather api")
	public void the_user_submits_get_request_for_weather_api() throws Throwable {
         
		stepLibrary.submitRequestGet();
	}
	
	@Given("The user submits the POST request for creating an user")
	public void the_user_submits_post_request_for_creating_user() throws Throwable {
		
		//Creating a JSONParser object
		 JSONParser jsonParser = new JSONParser();
		 
		 
		//Parsing the contents of the JSON file
         JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("src/test/requestTemplates/get.json"));
         String request = jsonObject.toString();
         
         ObjectMapper mapper = new ObjectMapper();
         Object json = mapper.readValue(request, Object.class);
         String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json); 
         
        System.out.println("the request is : "+ jsonStr);

		stepLibrary.submitRequestPost(jsonStr);
	}
	
	@Then("The response status code should be {int}")
	public void the_response_status_code_should_be(int respStatusCode) {
	    Assert.assertEquals(respStatusCode, stepLibrary.getResponseStatusCode());
	}

}
