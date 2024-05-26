package package_person_homework;

import java.time.LocalDate;

public class Person {
    // this file does not have a main method
    // we still start by tying fields (variables)

    String name;
    char gender;
    int age;
    // changing car to int because we will base decisions on model year
    int car;
    boolean violations;
    double creditScore;

    // We are going to use current year when evaluating the age of a car
    int currentYear = LocalDate.now().getYear();


    public void display() {
        System.out.println("Customer Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Car Model Year: " +car);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);
        
    }

    // Our logic is considering our credit score and violations

    public double getRate(double monthlyRate){
        if(violations == true && creditScore <= 700){
            monthlyRate = 500.00;
        }else{
            monthlyRate = 100.00;
        }
        return monthlyRate;
    }

    public double assumeGender(double adjustedRate){
        if (gender == 'M' && age <= 25){
            adjustedRate = 100.00;
        } else{
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    public double evalAge (double adjustedRateCar){
        // we will add an extra fee if the car is less than 5 years old
        // we are using "current year" to be fancy!
        if(car <= currentYear-5){
            adjustedRateCar = 0;
        }else if(car > currentYear) {
            // just in case we pre-buy next year's model
            adjustedRateCar = 200.00;
        }else{
            // we'll get even fancier and use a sliding scale
            // based on year
            int carFactor = 5-(currentYear - car);
            adjustedRateCar = 25 * carFactor;
        }
        return adjustedRateCar;
}

}
