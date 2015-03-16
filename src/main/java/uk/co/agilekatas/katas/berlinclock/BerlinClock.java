package uk.co.agilekatas.katas.berlinclock;

public class BerlinClock {

    public String convert(String time) {
        String[] parts = time.split(":");
        String clock = "OOOOOOOOOOOOOOOOOOOO";

        int minutes = Integer.parseInt(parts[1]);
        String singleMinutes = calculateSingleMinutes(minutes);

        String s = clock + singleMinutes;
        System.out.println(s);
        return s;
    }

    private String calculateSingleMinutes(int minutes) {
        String singleMinutes = "";
        System.out.println(minutes);
        int remainder = minutes % 5;
        System.out.println(remainder);
        for(int i = 1; i <=4; i++) {
            if (i <= remainder) {
                singleMinutes += "Y";
            } else {
                singleMinutes += "O";
            }
        }
        System.out.println(singleMinutes);
        return singleMinutes;
    }

}
