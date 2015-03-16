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

    @Then("^([^\"]*) is returned for the five minutes row$")
    public void _row_is_returned_for_the_five_minutes_row(String row) {
        String fiveMinutesRow = clock.substring(9, 20);
        assertThat(fiveMinutesRow).isEqualTo(row);
    }

    @Then("^([^\"]*) is returned for the single hours row$")
    public void _row_is_returned_for_the_single_hours_row(String row) {
        String singleHours = clock.substring(5, 9);
        assertThat(singleHours).isEqualTo(row);
    }

    @Then("^([^\"]*) is returned for the five hours row$")
    public void _row_is_returned_for_the_five_hours_row(String row) {
        String fiveHours = clock.substring(1, 5);
        assertThat(fiveHours).isEqualTo(row);
    }
}
