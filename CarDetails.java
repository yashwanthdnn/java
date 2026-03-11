/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

import java.util.Scanner;

public class CarDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Name: ");
        String carName = sc.nextLine();

        System.out.print("Enter Car Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Car Price: ");
        double price = sc.nextDouble();

        System.out.println("Car Details");
        System.out.println("Car Name:" + carName);
        System.out.println("Brand:" + brand);
        System.out.println("Price:" + price);

    }
}
