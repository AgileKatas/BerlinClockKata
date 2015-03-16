package uk.co.agilekatas.katas.berlinclock;

public class BerlinClock {

    public String convert(String time) {
        String[] parts = time.split(":");
        String clock = "OOOOOOOOOOOOOOOOOOOO";

        int minutes = Integer.parseInt(parts[1]);
        String singleMinutes = calculateSingleMinutes(minutes);

        return clock + singleMinutes;
    }

    private String calculateSingleMinutes(int minutes) {
        String singleMinutes = "";
        int remainder = minutes % 5;
        for(int i = 1; i <=4; i++) {
            if (i <= remainder) {
                singleMinutes += "Y";
            } else {
                singleMinutes += "O";
            }
        }
        return singleMinutes;
    }

}
