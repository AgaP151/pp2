import java.lang.String;

public class Checker {
    public static void countDays1(int month, int year) {
String monthName;
int days;

        switch(month){
            case 1:
                monthName = "Styczeń";
                days = 31;
                break;
            case 2:
                monthName = "Luty";
                if(isLeapYear(year)){
                    days = 29;
                } else {
                    days = 28;
            }
                break;

            case 3:
            monthName = "Marzec";
            days = 31;
                break;
            case 4:
                monthName = "Kwiecień";
                days = 30;
                break;
            case 5:
                monthName = "Maj";
                days = 31;
                break;
            case 6:
                monthName = "Czerwiec";
                days = 30;
                break;
            case 7:
                monthName = "Lipiec";
                days = 31;
                break;
            case 8:
                monthName = "Sierpień";
                days = 31;
                break;
            case 9:
                monthName = "Wrzesień";
                days = 30;
                break;
            case 10:
                monthName = "Październik";
                days = 31;
                break;
            case 11:
                monthName = "Listopad";
                days = 30;
                break;
            case 12:
                monthName = "Grudzień";
                days = 31;
                break;

            default:
                monthName = "Nieznany miesiąc";
                days = 0;
        }
        System.out.println(monthName  + " "  + year  + " ma "  + days  + " dni.");

    }

    public static void countDays2(int month, int year) {
String monthName = switch (month) {
    case 1 -> "Styczeń";
    case 2 -> "Luty";
    case 3 -> "Marzec";
    case 4 -> "Kwiecień";
    case 5 -> "Maj";
    case 6 -> "Czerwiec";
    case 7 -> "Lipiec";
    case 8 -> "Sierpień";
    case 9 -> "Wrzesień";
    case 10 -> "Październik";
    case 11 -> "Listopad";
    case 12 -> "Grudzień";

    default -> "Nieznany miesiąc";
    };
int days = switch(month){
    case 1, 3, 5, 7, 8, 10, 12 -> 31;
    case 4, 6, 9, 11 -> 30;
    case 2->isLeapYear(year)?29:28;
    default -> throw new IllegalArgumentException("Niepoprawny numer miesiąca: " + month);
};

    }
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
    }

}
