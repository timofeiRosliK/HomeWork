package date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.util.Locale;

public class Data {
    public static void main(String[] args) {
        String output = outputDate(LocalDateTime.now());
        System.out.println("output = " + output);
        long minutes = countMinutes("27-07-2023 18:00:00");
        System.out.println("minutes = " + minutes);
        //task 10
        boolean isDayOff = isDayOff("28-07-2023 10:00:00");
        System.out.println("isDayOff = " + isDayOff);
        //task11
        DayOfWeek dayOfWeek = calcDayOfWeek("09-03-2023");
        System.out.println("dayOfWeek = " + dayOfWeek);
        //task12
        int days = findGap("09-03-2023", "15-03-2023");
        System.out.println("gap = " + days);
        //task13
        String finalDate = getFinalDate("09-03-2023 10:00:00");
        System.out.println("finalDate = " + finalDate);
        //task14
        LocalDate nextMonday = getDateOfNextMonday("29-07-2023");
        System.out.println("nextMonday = " + nextMonday);
        //task16
        int maxVowelLettersInRow = calcMaxVowels("beep");
        System.out.println("maxVowelLettersInRow = " + maxVowelLettersInRow);
        //task21
        String theFirstDayOfMonth = findTheFirstDayOfMonth("15-03-2023");
        System.out.println("theFirstDayOfMonth = " + theFirstDayOfMonth);
        //task22
        String theLastDayOfMonth = findTheLastDay("15-03-2023");
        System.out.println("theLastDayOfMonth = " + theLastDayOfMonth);
        //task 23
        int gapBetweenMonths = diffBetweenMonth("01-01-2023", "01-07-2023");
        System.out.println("gapBetweenMonths = " + gapBetweenMonths);
        //task24
        int daysUntilTheEndOfMonth = calcDaysUntilTheEndOfMonth("28-07-2023");
        System.out.println("daysUntilTheEndOfMonth = " + daysUntilTheEndOfMonth);
        //task25
        long difference = fistDayOfYear("16-03-2023");
        System.out.println("difference = " + difference);
        //task26
        boolean isWeekDay = isWeekDay("09-03-2023 10:00:00");
        System.out.println("isWeekDay = " + isWeekDay);
        //task17
        boolean isPanGram = isPanGram("The quick brown fox jumps over the lazy dog" );
        System.out.println("isPanGram = " + isPanGram);


    }

    public static String outputDate(LocalDateTime time) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return time.format(dateTimeFormatter);
    }

    public static long countMinutes(String str) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(str, dateTimeFormatter);
        LocalDateTime now = LocalDateTime.now();
        return ChronoUnit.MINUTES.between(dateTime, now);


    }

    //task10
    public static boolean isDayOff(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime time = LocalDateTime.parse(str, formatter);
        if (time.getDayOfWeek() == DayOfWeek.SATURDAY || time.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return true;
        }
        return false;
    }

    //task11
    public static DayOfWeek calcDayOfWeek(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(str, formatter);
        return date.getDayOfWeek();
    }

    //task12
    public static int findGap(String str1, String str2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate initialDate = LocalDate.parse(str1, formatter);
        LocalDate finalDate = LocalDate.parse(str2, formatter);
        return Period.between(initialDate, finalDate).getDays();
    }

    //task13
    public static String getFinalDate(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime time = LocalDateTime.parse(str, formatter);
        LocalDateTime timePlusHours = time.plus(3, ChronoUnit.HOURS);
        LocalDateTime timePlusMinutes = timePlusHours.plus(20, ChronoUnit.MINUTES);
        LocalDateTime timePlusSeconds = timePlusMinutes.plusSeconds(20);
        return timePlusSeconds.format(formatter);
    }

    //task14
    public static LocalDate getDateOfNextMonday(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate initialDate = LocalDate.parse(str, formatter);
        return initialDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    }


    public static int calcMaxVowels(String str) {
        char[] chars = str.toCharArray();
        char[] vowels = {'a', 'e', 'o', 'u', 'i' };
        int max = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if ((chars[i] == vowels[j]) && (chars[i + 1] == vowels[j])) {
                    max++;
                }

            }

        }
        return max;
    }

    //task21
    public static String findTheFirstDayOfMonth(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(str, formatter);
        LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
        return firstDayOfMonth.format(formatter);
    }

    //task22
    public static String findTheLastDay(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(str, formatter);
        return date.with(TemporalAdjusters.lastDayOfMonth()).format(formatter);
    }

    //task23
    public static int diffBetweenMonth(String str1, String str2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate initialDate = LocalDate.parse(str1, formatter);
        LocalDate finalDate = LocalDate.parse(str2, formatter);
        return Period.between(initialDate, finalDate).getMonths();
    }

    //task24
    public static int calcDaysUntilTheEndOfMonth(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate initialDate = LocalDate.parse(str, formatter);
        LocalDate finalDate = initialDate.with(TemporalAdjusters.lastDayOfMonth());
        return Period.between(initialDate, finalDate).getDays();
    }

    //task25
    public static long fistDayOfYear(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate initialDate = LocalDate.parse(str, formatter);
        LocalDate date = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        return ChronoUnit.DAYS.between(date, initialDate);
        // return Period.between(date,initialDate).getDays();
    }

    //task26
    public static boolean isWeekDay(String str) {
        DayOfWeek[] dayOfWeeks = {DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY,
                DayOfWeek.FRIDAY};
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime initialTime = LocalDateTime.parse(str, formatter);
        for (DayOfWeek dayOfWeek : dayOfWeeks) {
            if (initialTime.getDayOfWeek().equals(dayOfWeek)) {
                return true;
            }

        }
        return false;
    }
    public static boolean isPanGram(String str){
        if (str.matches("[a-zA-z]") && str.matches(" ") ){
            return true;
        }
        return false;
    }


}
