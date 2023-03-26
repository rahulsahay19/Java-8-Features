package dates;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " +localDate);
        LocalDate localDate1 = LocalDate.of(2018, 07, 17);
        System.out.println("localDate1: " +localDate1);
        LocalDate localDate2 = LocalDate.ofYearDay(2018, 300);
        System.out.println("localDate2: " +localDate2);
        System.out.println("getMonth: " +localDate.getMonth());
        System.out.println("getMonthValue: " +localDate.getMonthValue());
        System.out.println("getDayOfWeek: " +localDate.getDayOfWeek());
        System.out.println("getDayOfYear: " +localDate.getDayOfYear());
        System.out.println("getDayOfMonth: " +localDate.getDayOfMonth());

    }
}
