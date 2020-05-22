package stepDefinitions;

import net.serenitybdd.screenplay.GivenWhenThen;
import questions.Answer;
import task.Login;
import task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.Search;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Carlos wants to learn automation at the academy Choucair$")
    public void than_Carlos_wants_to_learn_automation_at_the_academy_Choucair() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void he_search_for_the_course_metodología_Bancolombia_on_the_choucair_academy_platform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void he_finds_the_course_called_resources_metodología_Bancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
