public class Main {
    public static void main(String[] args) {

        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
    }

    public static void task_1() {
            //Задача 1
        System.out.println("Задача1");
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task_2() {
        System.out.println("Задача2");
        int clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }

        } else {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для OS Android по ссылке");
                } else {
                    //System.out.println("Установите версию приложения для iOS по ссылке");
                    System.out.println("Установите версию приложения для OS Android по ссылке");

                }
            }

    }

   public static void task_3() {
        System.out.println("Задача3");

        int years = 2021;
        //int a = years % 4;
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println(years + " является высокосным");
        } else {
            System.out.println(years + " не высокосный");
        }
    }

    public static void task_4() {
        System.out.println("Задача4");

        int deliveryDistance = 60;
        int days = 1;
        if(deliveryDistance > 20){
            days = (deliveryDistance / 40) + days;
            System.out.println("Потребуется " + days + " дней доставки");
        }
    }

    public static void task_5() {
        System.out.println("Задача5");
        int monthNumber = 7;
        switch (monthNumber){
            case 12:
            case 1:
            //System.out.println("Зима");
            //break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                //System.out.println("Весна");
                //break;
            case 4:
                //System.out.println("Весна");
                //break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                //System.out.println("Лето");
                //break;
            case 7:
                //System.out.println("Лето");
                //break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                //System.out.println("Осень");
                //break;
            case 10:
                //System.out.println("Осень");
                //break;
            case 11:
                System.out.println("Осень");
                break;
           // case 12:
             //   System.out.println("Зима");
               // break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }

    public static void task_6() {
        //Задача 6
        System.out.println("Задача6");
        int age = 23;
        int salary = 80_000;
        double limit = 0;
        if (age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }

        if (salary >= 50_000 && salary < 80_000) {
            limit = limit * 1.2;
        } else if (salary >= 80_000) {
            limit = limit * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

    }

    public static void task_7() {
        //Задача 7
        System.out.println("Задача7");
        int age = 25;
        int salary = 30_000;
        double wantedSum = 330_000;
        double baseRate = 0.1;
        if (age < 23) {
        baseRate = baseRate + 0.01;
        } else if (age < 30 && age >= 23) {
        baseRate = baseRate + 0.005;
        }
        if (salary > 80_000) {
            baseRate = baseRate - 0.007;

        } else {

        }
        double wantedSumTotal = wantedSum + wantedSum * baseRate;
        double loang = wantedSumTotal / 12;
        if (salary * 0.5 > loang) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + loang + " рублей. Платеж по кредиту " + wantedSumTotal + " рублей. Одобрено");

        } else if (salary * 0.5 < loang) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + loang + " рублей. Платеж по кредиту " + wantedSumTotal + " рублей. Отказано");
        }


        System.out.println(wantedSumTotal);
    }
}