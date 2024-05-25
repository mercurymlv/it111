package package_person;

public class PersonDetails {
    // This class will have a main method
    public static void main(String[] args){

        Person firstPerson;
        Person secondPerson;

        // We are in the process of creating an object from our Person class
        firstPerson = new Person();
        secondPerson = new Person();

        // We will be entering the info by assigning values to our fields
        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = "Volkswagen Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = "Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double monthlyRate = 0;


        firstPerson.display();
        System.out.println("Preliminary rate for " +firstPerson.name+ ": $" +firstPerson.getRate(monthlyRate)+ " dollars");

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary rate for " +secondPerson.name+ ": $" +secondPerson.getRate(monthlyRate)+ " dollars");



    } // end main
}
