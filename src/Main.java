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

    public static String checkersDistanceDay(int deliveryDistance) {
        int dayDelivery = 1;
        if (deliveryDistance > 100) {
            return "Доставка свыше 100 км не действует";
        } else if (deliveryDistance > 60) {
            dayDelivery++;
        } else if (deliveryDistance > 20) {
                dayDelivery++;
        }
        return "Потребуется дней " + dayDelivery;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 101;
        int deliveryDay = Integer.parseInt(checkersDistanceDay(deliveryDistance));
        if (deliveryDay > 3) {
            System.out.println("Доставка свыше 100 км не действует");
        } else {
            System.out.println("Потребуется для доставки дней: " + deliveryDay);
        }
    }
}