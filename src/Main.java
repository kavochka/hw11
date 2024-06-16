import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printIsLeapYear(2000);
        printValidTypeInfo(1, 2024);
        calculateDeliveryDays(110);
    }

    public static void printIsLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 || year % 100 != 0 && year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void printValidTypeInfo(int type, int year) {
        int currentYear = LocalDate.now().getYear();
        String resultType;
        String resultStatus;
        if (type == 1) {
            resultType = "IOS";
        } else {
            resultType = "Android";
        }
        if (year < currentYear) {
            resultStatus = "облегченную ";
        } else {
            resultStatus = "";
        }
        System.out.printf("Требуется установить %sверсию приложения для %s.%n", resultStatus, resultType);
    }

    public static int calculateDeliveryDays(int distance) {
        int resultDays = 1;
        if (distance > 20) {
            resultDays++;
        }
        if (distance > 60) {
            resultDays++;
        }
        if (distance > 100) {
            System.out.println("Delivery is not possible");
            return -1;
        }
        return resultDays;

    }

}