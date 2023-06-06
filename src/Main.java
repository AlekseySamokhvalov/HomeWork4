import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1(); // решения задачи 1
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру воздуха: ");
        int temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if(temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите скорость: ");
        int speed = scanner.nextInt();

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else if(speed >=0){
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else if (age <= 6) { //age >= 2 &&
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age <= 18) { //age >= 7 &&
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age < 24) { //age > 18 &&
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age <= 60) { //age >= 24 &&
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст ребенка: ");
        int age = scanner.nextInt();

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age < 14) { //age >= 5 &&
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество пассажиров: ");
        int passengers = scanner.nextInt();

        if (passengers > 102) {
            System.out.println("В вагоне нет места для всех пассажиров.");
        } else if (passengers >= 60) {
            int standingPassengers = 102 - passengers;
            System.out.println("В вагоне нет сидячих мест, но есть " + standingPassengers + " стоячих мест.");
        } else {
            int seatPlace = 60 - passengers;
            System.out.println("В вагоне есть " + seatPlace + " свободных сидячих мест и " + (102 - 60) + " свободных стоячих мест.");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int one = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int two = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int three = scanner.nextInt();

        if (one > two && one > three) {
            System.out.println("Первое число " + one + " является наибольшим.");
        } else if (two > one && two > three) {
            System.out.println("Второе число " + two + " является наибольшим.");
        } else {
            System.out.println("Третье число " + three + " является наибольшим.");
        }
    }

}