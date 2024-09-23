public class Main {
    public static void main(String[] args) {
        System.out.println("Задча 1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг " +
                    "совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задча 2");
        int outdoorTemperature = 2;
        if (outdoorTemperature < 5) {
            System.out.println("На улице холодно," + outdoorTemperature + " град., нужно надеть шапку.");
        } else {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки.");
        }
        System.out.println("Задча 3");
        int speedCar = 50;
        if (speedCar < 60) {
            System.out.println("Если скорость " + speedCar + " км/ч, можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speedCar + " км/ч, придется заплатить штраф.");
        }
        System.out.println("Задча 4");
        int agePerson = 3;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");
        } else if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");
        }
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то его место в университете.");
        } else if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу.");
        }
        System.out.println("Задча 5");
        int age5 = 14;
        if (age5 <= 5) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему нельзя кататься на аттракционе.");
        }
        if (age5 > 5 && age5 < 14) {
            System.out.println("Если возраст ребенка равен " + age5 + " лет, он может кататься только в сопровождении взрослого.");
        }
        if (age5 >= 14) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println("Задча 6");
        int passengerNom = 61;
        int totalSeats = 102;
        int capacitySitting = 60;
        if (passengerNom <= capacitySitting) {
            System.out.println("Есть сидячие места");
        } else if (passengerNom > capacitySitting && passengerNom <= totalSeats) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("В вагоне нет мест.");
        }
        System.out.println("Задча 7");
        int one = 676;
        int two = 514;
        int three = 100;
        if (one >= two && one >= three) {
            System.out.println("Самое большое число - " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое число - " + two);
        } else {
            System.out.println("Самое большое число - " + three);
        }
    }
}