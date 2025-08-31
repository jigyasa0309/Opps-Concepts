package org.example;

import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the country of origin: ");
                String country = scanner.nextLine().trim();

                try {
                    Car car = CarFactory.createCar(country);
                    car.displayDetails();
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                scanner.close();
            }
        }
