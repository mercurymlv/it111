package package_person_input;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args){

        // we need to create an object from our Person class
        Person customer;
        customer = new Person();

        // we will be initializing add'l variables right here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        customer.name = input.next();
        System.out.print("Please enter your age: ");
        customer.age = input.nextInt();
        System.out.print("Please enter your gender: ");
        customer.gender = input.next().charAt(0);
        System.out.print("Please enter your zipcode: ");
        customer.zipCode = input.next();

        customer.display();


    } // end main
}
