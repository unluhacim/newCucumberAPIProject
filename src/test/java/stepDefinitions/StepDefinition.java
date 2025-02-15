package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinition {
    String base = RestAssured.baseURI = "https://rahulshettyacademy.com";
    RequestSpecification request;
    Response response;

    @Given("Add Place API request is prepared with query param {string}")
    public void add_place_api_request_is_prepared_with_query_param(String queryValue) throws IOException {
        request = given().log().all().queryParam("key", queryValue).header("Content-Type", "application/json")
                .body(new String(Files.readAllBytes(Paths.get("src\\test\\java\\files\\AddPlaceJson.json"))));

    }

    @When("user calls {string} with Post http request")
    public void user_calls_with_post_http_request(String endpointURL) {
        response = request.when().post(endpointURL);

    }
    @Then("the API call is success with status code {int}")
    //@Then("^the API call is success with status code (.+)$")   //You can use this Regex patter for any data type
    public void theAPICallIsSuccessWithStatusCode(int status) {
        response.then().log().all().assertThat().statusCode(status);
    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String key, String value) {
        response.then().assertThat().body(key, equalTo(value));

    }
    String name="";
    @Given("Insert user {string}, {string} and {string}")
    public void insert_user_and(String name, String lname, String city) {
        System.out.println(name+" - "+lname+" - "+city);
        this.name=name;

    }
    @When("Click submit button")
    public void click_submit_button() {
        System.out.println("Clicked submit button");
    }
    @Then("Verify user {string} is added")
    public void verify_user_is_added(String user) {
        Assert.assertEquals(user,name);
        System.out.println("Successfully verified the user");
    }

    @Given("user is on the info page")
    public void user_is_on_the_info_page() {
        System.out.println("in the info page");
    }
    String user="";
    @When("insert user")
    public void insert_users(List<String> data) {
        System.out.println(data.get(0)+" - "+data.get(1)+" - "+data.get(2)+" - "+data.get(3)+" - "+data.get(4));
        this.user=data.get(0);
    }
    @Then("verify user is inserted")
    public void verify_users_are_inserted() {
        System.out.println("user: "+user);

    }


}
