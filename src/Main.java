public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int year = 1010;
        checkYearIsLeapAndPrint(year);
    }

    private static void checkYearIsLeapAndPrint(int leapYear) {
        if (leapYear > 1584 && (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0)) {
            System.out.println(leapYear + " год является високосным");
        } else {
            System.out.println(leapYear + " год не является високосным");
        }
        System.out.println("task2");
        int clientOs = 1;
        int clientDeviceYear = 2015;
        validateDeviceAndYear(clientOs, clientDeviceYear);
    }

    private static void validateDeviceAndYear(int deviceType, int year) {
        if (deviceType == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для ios по ссылке");
        } else if (deviceType == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (deviceType == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else if (deviceType == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такая система не поддерживается");
        }
    }

    public static void main2(String[] args) {
        printCardDeliveryDays(95);
        printCardDeliveryDays(900);
    }

    private static int checkersDistanceDay(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    private static void printCardDeliveryDays(int distance) {
        int days = checkersDistanceDay(distance);

        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}