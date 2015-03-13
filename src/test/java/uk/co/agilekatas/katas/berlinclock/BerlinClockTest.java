package uk.co.agilekatas.katas.berlinclock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BerlinClockTest {

    private static final String MIDNIGHT = "00:00:00";
    private static final String NO_LAMPS = "OOOO";

    private BerlinClock berlinClock = new BerlinClock();

    @Test
    public void shouldReturnCorrectSingleMinutesRowForMidnight() {
        String time = MIDNIGHT;

        String clock = berlinClock.convert(time);

        String singleMinutes = clock.substring(19, 23);
        assertThat(singleMinutes).isEqualTo(NO_LAMPS);
    }

}
