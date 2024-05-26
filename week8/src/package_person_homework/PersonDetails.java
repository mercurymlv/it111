package package_person_homework;

public class PersonDetails {
    // This class will have a main method
    public static void main(String[] args){

        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;

        // We are in the process of creating an object from our Person class
        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();

        // We will be entering the info by assigning values to our fields
        firstPerson.name = "Cathy Jensen";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2021;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall Merriweather";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 1965;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Maria Fitzsimmons";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.car = 2010;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

        double monthlyRate = 0;
        double adjustedRate = 0;
        double adjustedRateCar = 0;


        // we want to round the currency values to 2 decimal places
        // this means using a print"f" along with %.2f
        // the %n at the end is necessary to return the line - because we no longer have print"ln"
        firstPerson.display();
        System.out.printf("Preliminary rate for %s: $%.2f dollars%n", firstPerson.name, firstPerson.getRate(monthlyRate));
        System.out.printf("Adjustments (Demographics): $%.2f dollars%n", firstPerson.assumeGender(adjustedRate));
        System.out.printf("Adjustments (Car Age): $%.2f dollars%n", firstPerson.evalAge(adjustedRateCar));
        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: $");
        System.out.printf("%.2f%n",firstPerson.getRate(monthlyRate) + firstPerson.assumeGender(adjustedRate)  + firstPerson.evalAge(adjustedRateCar));

        System.out.println();

        secondPerson.display();
        System.out.printf("Preliminary rate for %s: $%.2f dollars%n", secondPerson.name, secondPerson.getRate(monthlyRate));
        System.out.printf("Adjustments (Demographics): $%.2f dollars%n", secondPerson.assumeGender(adjustedRate));
        System.out.printf("Adjustments (Car Age): $%.2f dollars%n", secondPerson.evalAge(adjustedRateCar));
        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: $");
        System.out.printf("%.2f%n",secondPerson.getRate(monthlyRate) + secondPerson.assumeGender(adjustedRate)  + secondPerson.evalAge(adjustedRateCar));

        System.out.println();

        thirdPerson.display();
        System.out.printf("Preliminary rate for %s: $%.2f dollars%n", thirdPerson.name, thirdPerson.getRate(monthlyRate));
        System.out.printf("Adjustments (Demographics): $%.2f dollars%n", thirdPerson.assumeGender(adjustedRate));
        System.out.printf("Adjustments (Car Age): $%.2f dollars%n", thirdPerson.evalAge(adjustedRateCar));
        System.out.print("Here is " + thirdPerson.name + "'s total monthly premium: $");
        System.out.printf("%.2f%n", thirdPerson.getRate(monthlyRate) + thirdPerson.assumeGender(adjustedRate) + thirdPerson.evalAge(adjustedRateCar));


    } // end main
}
