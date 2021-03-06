package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.UserInfoPage;
import pages.LoginPage;
import utilities.Driver;

public class UserInfoPageStepDefs {

      LoginPage login = new LoginPage();
      UserInfoPage userInfoPage = new UserInfoPage();


    @Given("Customer is logged in")
    public void customer_is_logged_in() {

            login.LoginMethod();
        }

    @When("Customer clicks the setting button")
    public void customer_clicks_the_setting_button() {
        userInfoPage.settingModule();

    }

    @When("Customer clicks the User info tab")
    public void customer_clicks_the_user_info_tab() {
        userInfoPage.userInfoModule();
    }

    @Then("Customer edit info fields to add updated info")
    public void customer_edit_info_fields_to_add_updated_info() {

        Driver.getDriver().manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,250)");
        userInfoPage.setFirstName();
        userInfoPage.setMiddleName();
        userInfoPage.setLastName();
        userInfoPage.setUrl();
        userInfoPage.setCompany();
        userInfoPage.setBio();
        userInfoPage.updateInfo();
    }

    @Then("Verify to the changes")
    public void verify_to_the_changes() {

        userInfoPage.verifyClick();


    }
}
