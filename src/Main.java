public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задча 1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг " +
                    "совершеннолетия, нужно немного подождать");
        }
        // Task 2
        System.out.println("Задча 2");
        int outdoorTemperature = 2;
        if (outdoorTemperature < 5) {
            System.out.println("На улице холодно," + outdoorTemperature + " град., нужно надеть шапку.");
        } else {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки.");
        }
        // Task 3
        System.out.println("Задча 3");
        int speedCar = 50;

        if (speedCar < 60) {
            System.out.println("Если скорость " + speedCar + " км/ч, можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speedCar + " км/ч, придется заплатить штраф.");
        }
        // Task 4
        System.out.println("Задча 4");
        age = 9;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
        // Task 5
        System.out.println("Задча 5");
        age = 3;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, он может кататься только в сопровождении взрослого.");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        // Task 6
        System.out.println("Задча 6");
        int passengerNom = 70;
        int totalSeats = 102;
        int capacitySitting = 60;

        if (passengerNom <= capacitySitting) {
            System.out.println("Есть сидячие места");
        } else if (passengerNom > capacitySitting && passengerNom <= totalSeats) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("В вагоне нет мест.");
        }
        // Task 7
        System.out.println("Задча 7");
        int one = 676;
        int two = 677;
        int three = 100;

        if (one >= two && one >= three) {
            System.out.println("Самое большое число - " + one);
        } else if (two >= three) {
            System.out.println("Самое большое число - " + two);
        } else {
            System.out.println("Самое большое число - " + three);
        }
    }
}