import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyTimesDates {
    public static void main(String[] args){
        // keep it simple - let's display the current date

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        // I don't like that - I want to see month, day of week, and year!
        Month currentMonth = LocalDate.now().getMonth();
        System.out.println(currentMonth);

        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        System.out.println(currentDay);

        // The year would have to be an integer

        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);

        // We would like to know the number of the day - if today is the 8th of the month we want to display 8

        int currentDayNumber = LocalDate.now().getDayOfMonth();
        System.out.println(currentDayNumber);


        // I'm adding this on my own to get the correct ordinal suffix, i.e. 1st, 2nd, etc...
        String dateSuffix;
        // The suffix is always "th" except for numbers ending in 1, 2, 3 EXCEPT for 11, 12, 13
        // I'm using modulus to figure out when it's 1,2, or 3 and just hard-coding a check for 11-13
        if(currentDayNumber >=11 && currentDayNumber <=13){
            dateSuffix = "th";
        } else {
            switch (currentDayNumber % 10) {
                case 1 -> dateSuffix = "st";
                case 2 -> dateSuffix = "nd";
                case 3 -> dateSuffix = "rd";
                default -> dateSuffix = "th";
            }
        }


        System.out.println("Today is " +currentDay+ ", " +currentMonth+ " " +currentDayNumber + dateSuffix+ ", " +currentYear +"!!!");



    } // end main
}
