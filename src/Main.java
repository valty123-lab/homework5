public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1.
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }

        //Задача 2.
        for (int i = 10; i >= 0; i = i - 1) {
            System.out.println("Итерация цикла" + i);
        }
        //Задача 3.
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация цилка" + i);
        }
        //Задача 4.
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цилка" + i);
        }
        // задача 5.
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Итерация цилка" + i);
        }


        //зАДАЧА 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Итерация цилка" + i);
        }

        //Задача 7.
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Итерация цилка" + i);
        }

        //задача 8.
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + salary;
        }
        System.out.println("месяц" + salary + "cумма годовых накоплений" + total);

        //задача 9.
         salary = 29000;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);

        //задача 10
        for (int i = 1; i <= 10; i = i +1) {
            System.out.println("2* " + i +"=" + 2*i);
        }




    }
}