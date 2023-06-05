import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1(); //вызов метода решения задачи 1
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
    }

    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
    }

}