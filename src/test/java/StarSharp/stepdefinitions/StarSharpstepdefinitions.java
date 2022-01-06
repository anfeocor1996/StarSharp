package StarSharp.stepdefinitions;

import StarSharp.Tasks.*;
import StarSharp.model.TheData;
import StarSharp.question.Answer;
import StarSharp.question.Answer2;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StarSharpstepdefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    // Scenario1

    @Given("^than Andres wants to use the StarSharp app$")
    public void thanAndresWantsToUseTheStarSharpApp(List<TheData> withthedata) {
        theActorCalled("Andres").wasAbleTo(OpenUp.thePage(), Login.onThePage(withthedata));

    }

    @When("^he creates AndresUnit on the StarSharp platform$")
    public void heCreatesAndresUnitOnTheStarSharpPlatform(List<TheData> withthedata) {
       theActorInTheSpotlight().attemptsTo(CreateBussinesUnit.onThePage(withthedata));

    }

    @Then("^he finds the business unit created called (.*)$")
    public void heFindsTheBusinessUnitCreatedCalledAndresUnit(String question) {
       theActorInTheSpotlight().should(seeThat(Answer.toThe(question)));

    }

    //Scenario2

    @Given("^than Andres wants to use the StarSharp platform$")
    public void thanAndresWantsToUseTheStarSharpPlatform(List<TheData> withthedata) {
       theActorCalled("Andres").wasAbleTo(OpenUp.thePage(),(Login2.onThePage(withthedata)));

    }

    @When("^he creates Andresmeeting$")
    public void heCreatesAndresmeeting(List<TheData>witthedata) {
      theActorInTheSpotlight().attemptsTo(CreateMeeting.onThePage(witthedata));

    }

    @Then("^he finds the new meeting called (.*)$")
    public void heFindsTheNewMeetingCalledAndresmeeting(String question2) {
        theActorInTheSpotlight().should(seeThat(Answer2.toThe(question2)));

    }


}
