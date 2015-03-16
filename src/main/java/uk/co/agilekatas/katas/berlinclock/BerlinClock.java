package uk.co.agilekatas.katas.berlinclock;

public class BerlinClock {

    private static final String RED_LAMP = "R";
    private static final String YELLOW_LAMP = "Y";
    private static final String OFF_LAMP = "O";

    public String convert(String time) {
        String[] parts = time.split(":");
        String clock = "Y";

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        String fiveHours = calculateFiveHoursRow(hours);
        String singleHours = calculateSingleHoursRow(hours);
        String fiveMinutes = calculateFiveMinutesRow(minutes);
        String singleMinutes = calculateSingleMinutesRow(minutes);

        return clock + fiveHours + singleHours + fiveMinutes + singleMinutes;
    }

    private String calculateFiveHoursRow(int hours) {
        String fiveHours = "";
        int lamps = hours / 5;
        for (int i = 1; i <= 4; i++) {
            if (i <= lamps) {
                fiveHours += RED_LAMP;
            } else {
                fiveHours += OFF_LAMP;
            }
        }
        return fiveHours;
    }

    private String calculateSingleHoursRow(int hours) {
        String singleHours = "";
        int lamps = hours % 5;
        for (int i = 1; i <= 4; i++) {
            if (i <= lamps) {
                singleHours += RED_LAMP;
            } else {
                singleHours += OFF_LAMP;
            }
        }
        return singleHours;
    }

    private String calculateFiveMinutesRow(int minutes) {
        String fiveMinutes = "";
        int lamps = minutes / 5;
        for (int i = 1; i <= 11; i++) {
            if (i <= lamps) {
                fiveMinutes += redOrYellowLamp(i);
            } else {
                fiveMinutes += OFF_LAMP;
            }
        }
        return fiveMinutes;
    }

    private String redOrYellowLamp(int lampNumber) {
        if (lampNumber % 3 == 0)
            return RED_LAMP;
        return YELLOW_LAMP;
    }

    private String calculateSingleMinutesRow(int minutes) {
        String singleMinutes = "";
        int lamps = minutes % 5;
        for (int i = 1; i <= 4; i++) {
            if (i <= lamps) {
                singleMinutes += YELLOW_LAMP;
            } else {
                singleMinutes += OFF_LAMP;
            }
        }
        return singleMinutes;
    }

}
