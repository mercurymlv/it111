package package_person_input;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args){

        // we need to create an object from our Person class
        Person customer;
        customer = new Person();

        // need to enter add'l variables
        int states = 0;
        double surchange = 0;


        // we will be initializing add'l variables right here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        customer.name = input.next();
        System.out.print("Please enter your age: ");
        customer.age = input.nextInt();
        System.out.print("Please enter your gender by entering F or M or N: ");
        customer.gender = input.next().charAt(0);
        System.out.print("Please enter your 5-digit zipcode: ");
        customer.zipCode = input.next();

        System.out.print("Any traffic violations? Please enter true for yes and false for no: ");
        customer.violations = input.nextBoolean();

        // add an if-else to check if and what violations they have
        if (customer.violations == true){
            System.out.print("Please type true if you had a DUI, or false if not: ");
            customer.violationDUI = input.nextBoolean();
            System.out.print("Please type true if you had a red light violation, or false if not: ");
            customer.violationRedLight = input.nextBoolean();
            System.out.print("Please type true if you have received a speeding ticket, or false if not: ");
            customer.violationSpeeding = input.nextBoolean();

        // not sure if this is necessary, will it just default to false on initialization?
        } else {
            customer.violationDUI = false;
            customer.violationRedLight= false;
            customer.violationSpeeding = false;
        }

        System.out.print("Please enter your credit score: ");
        customer.creditScore = input.nextDouble();

        customer.display();

        customer.identifyRegion(states);
        System.out.println("Your regional surcharge is " +customer.californiaRegion(surchange)+ " dollars");


    } // end main
}
