import java.util.Scanner;

public class Main {

    //Testing Version Control
    public static void main(String[] args) {
        Mercedes car1 = new Mercedes("S-Klass", 2024, 290);
        Mercedes car2 = new Mercedes("E63s", 2016, 300);
        Mercedes car3 = new Mercedes("C63", 2009, 250);
        Mercedes car4 = new Mercedes("Brabus", 2020, 240);
        Mercedes car5 = new Mercedes("Brabus", 2021, 330);

        System.out.println("Auffuhren of Mercedes-Benz:");
        System.out.println("------------------------------");
        System.out.println("S-Klass:    2024 290 kph");
        System.out.println("E63s:       2016 300 kph");
        System.out.println("C63:        2009 250 kph");
        System.out.println("Brabus:     2020 240 kph");
        System.out.println("Brabus:     2021 330 kph");
        System.out.println("------------------------");
        System.out.println("\nEnter Your Mercedes-Benz ");
        System.out.println("Und Example:");
        System.out.println("Klass Year Speed");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        try {
            // Equality operator using user-selected cars
            System.out.println("Mercedes-Benz Ein: ");
            Mercedes userCar1 = Mercedes.readFromInput(scanner);
            System.out.println("\nMercedes-Benz Zwei: ");
            Mercedes userCar2 = Mercedes.readFromInput(scanner);

            if (userCar1.equals(userCar2)) {
                System.out.println(userCar1 + " Is de same as " + userCar2);
            } else {
                System.out.println(userCar1 + " Is nein de same as " + userCar2);
            }

            // Addition operator using user-selected cars
            Mercedes combinedUserCar = userCar1.add(userCar2);
            System.out.println("\nMercedes-Benz Zweimal: " + combinedUserCar);
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}