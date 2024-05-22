import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" Task 1");

        int clientOS = 0;

        if (clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (clientOS == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        }

        System.out.println(" Task 2");

        int year = 2015;
        int clientDeviceYear = 2014;
        int clientOS2 = 1;

        if (clientOS2 == 0 && clientDeviceYear >= year) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (clientOS2 == 0 && clientDeviceYear < year) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= year) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (clientOS2 == 1 && clientDeviceYear < year) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        }


        System.out.println(" Task 3");

        int year1 = 1888;

        if (year1 < 1584) {
            System.out.println(" Високосный год еще не придумали(");
        } else if (year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0) {
            System.out.println( year1 + ". год является високосным ");
        } else {
            System.out.println( year1 + ". год не является високосным ");
        }


        System.out.println(" Task 4 ");

        int deliveryDistance = 99;
        int deliveryDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println(" Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 60) {
            deliveryDays ++;
            System.out.println(" Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println(" Потребуется дней: " + deliveryDays);
        } else {
            System.out.println(" Доставки нет");
        }


        System.out.println(" Task 5 ");

        int monthNumber = 10;
        if (monthNumber > 12) {
            System.out.println("Неверное значение");
        } else switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень ");
            default:
        }
    }

}











