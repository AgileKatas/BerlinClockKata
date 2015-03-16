package uk.co.agilekatas.katas.berlinclock.cucumber;

import static org.assertj.core.api.Assertions.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.agilekatas.katas.berlinclock.BerlinClock;

public class BerlinClockStepdefs {

    private BerlinClock berlinClock;
    private String clock;

    @Given("^I have started the converter$")
    public void I_have_started_the_converter() {
        berlinClock = new BerlinClock();
    }

    @When("^I enter ([^\"]*)$")
    public void I_enter_time(String time) {
        clock = berlinClock.convert(time);
    }

    @Then("^([^\"]*) is returned for the single minutes row$")
    public void row_is_returned_for_the_single_minutes_row(String row) {
        String singleMinutesRow = clock.substring(20, 24);
        assertThat(singleMinutesRow).isEqualTo(row);
    }
}
