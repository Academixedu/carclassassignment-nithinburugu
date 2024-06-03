package com.example;

public class Main {
    public static void main(String[] args) {
        // Create a new car object
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 24000.00);

        // Display car details
        myCar.displayCarDetails();

        // Modify car details
        myCar.setColor("Blue");
        myCar.setPrice(23000.00);

        // Display updated car details
        System.out.println("\nUpdated Car Details:");

        myCar.displayCarDetails();

        System.out.println();

        Bank b = new Bank("ICICI", "Nithin", "7316326122", 1223.305);
        b.displayAccountDetails();
        b.setBalance(454236.8475);
        System.out.println("Balance after using set function : " + b.getBalance());

        System.out.println();

        Bike myBike = new Bike("Royal Enfield", "Classic 350", 2022, "Red", 270000);
        myBike.displayBikeDetails();
        myBike.setYear(2023);
        System.out.println("Correct year of manufacturing : " + myBike.getYear());

        System.out.println();

        Student s1 = new Student("Raghav", 22, "20211a1223", "Information Technology");
        s1.displayStudentDetails();
        s1.setMajor("Data Science");
        System.out.println("Major after using set : " + s1.getMajor());

        System.out.println();

        s1.displayStudentDetails();
    }
}
