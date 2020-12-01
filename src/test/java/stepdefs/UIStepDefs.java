package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.testng.annotations.Test;
import service.NavigationService;
import service.ValidationService;

public class UIStepDefs {

    private static NavigationService navigationService;
    private static ValidationService validationService;

    public UIStepDefs(NavigationService navigationService, ValidationService validationService) {
        this.navigationService = navigationService;
        this.validationService=validationService;
    }

    @Before
    @Test
    public void setUP(){
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(navigationService);
        pico.addComponent(validationService);
    }

    @Given("^A user is on the BBC homepage they can navigate to local weather via top$")
    public void a_user_is_on_the_BBC_homepage_they_can_navigate_to_local_weather_via_top() {
        navigationService.openBBCNewsHomePage();

    }

    @When("^A user selects \"([^\"]*)\" in the top toolbar$")
    public void a_user_selects_in_the_top_toolbar(String topBarLink) {
        navigationService.selectFromTopBarLink(topBarLink);

    }

    @Then("^The local weather is displayed$")
    public void the_local_weather_is_displayed() {
        validationService.CheckIfLocalWeatherShowing();
    }

    @Given("^A user is on the opinion homepage$")
    public void a_user_is_on_the_opinion_homepage() {
        navigationService.openOpinionPollPage();
    }

    @When("^I login$")
    public void i_login() throws Throwable {

        navigationService.LoginToOpinionPollSite();
    }

    @When("^start a survey$")
    public void start_a_survey() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^complete a survey$")
    public void complete_a_survey() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I get money$")
    public void i_get_money() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
