package uk.co.agilekatas.katas.berlinclock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BerlinClockTest {

    private static final String MIDNIGHT = "00:00:00";
    private static final String JUST_BEFORE_MIDNIGHT = "23:59:59";

    private static final String NO_LAMPS = "OOOO";
    private static final String FULL_ROW_YELLOW_LAMPS = "YYYY";

    private static final int SINGLE_MINUTE_START = 20;
    private static final int SINGLE_MINUTE_END = 24;

    private BerlinClock berlinClock = new BerlinClock();

    @Test
    public void shouldReturnCorrectSingleMinutesRowForMidnight() {
        String time = MIDNIGHT;

        String clock = berlinClock.convert(time);

        String singleMinutes = clock.substring(SINGLE_MINUTE_START, SINGLE_MINUTE_END);
        assertThat(singleMinutes).isEqualTo(NO_LAMPS);
    }

    @Test
    public void shouldReturnCorrectSingleMinutesRowForJustBeforeMidnight() {
        String time = JUST_BEFORE_MIDNIGHT;

        String clock = berlinClock.convert(time);

        String singleMinutes = clock.substring(SINGLE_MINUTE_START, SINGLE_MINUTE_END);
        assertThat(singleMinutes).isEqualTo(FULL_ROW_YELLOW_LAMPS);
    }

}
