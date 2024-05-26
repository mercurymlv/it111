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
        // apply an extra fee if car is more than 5 years old
        // we're going to get a little fancy and punish older cars
        // add $25 for every 5 years of the cars age
        if(car <= currentYear-5){
            int carFactor = (currentYear - car) / 5;
            adjustedRateCar = 25 * carFactor;
        }else{
            adjustedRateCar = 0;
        }
        return adjustedRateCar;
}

}
