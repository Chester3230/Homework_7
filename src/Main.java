import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Задание 1

        setYear(1804);


        //Задание 2

        int currentYear = LocalDate.now().getYear();

        setYearAndOS(currentYear, 1);


        //Задание 3

        int days = countingDays(60);
        int ost = days % 10;
        String text = " дней";
        if (ost >= 2 && ost <= 4 ) {
            text = " дня";
        } else if( ost == 1 ) {
            text =  " день";
        }

        System.out.println("Потребуется " + days + text);

    }

    public static void setYear(int year){
        int del = year % 100;
        if( (del > 1 && del % 4 == 0) || (del == 0 && year % 400 == 0) ) {
            System.out.println(year + " год является високосным");
        }
        else{
            System.out.println(year + " год не является високосным");
        }
    }

    public static void setYearAndOS(int clientDeviceYear, int ClientOS){

        if (ClientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (ClientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (ClientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        if (ClientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int countingDays(int deliveryDistance){
        int days = 0;
        if (deliveryDistance > 0 ) {
            days = days + 1;
        }
        if (deliveryDistance >= 20 ) {
            days = days + 1;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100 ) {
            days = days + 1;
        }
        return days;
    }

}