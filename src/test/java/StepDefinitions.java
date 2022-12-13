import Stepup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class StepDefinitions extends SetUp {
    LoginPage loginPage;
    @Given("User visited the portal")
    public void user_visited_the_portal() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("User inputs valid {string} and {string}")
    public void user_inputs_valid_username_and_password(String username, String password) {
        loginPage =new LoginPage(driver);
        loginPage.doLogin(username, password);

    }
    @Then("User can see dashboard")
    public void user_can_see_dashboard() {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("dashboard"));

    }
}
