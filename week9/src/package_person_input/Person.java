package package_person_input;

public class Person {
    // no main method
    // creating our fields
    String name;
    char gender;
    int age;
    String zipCode;

    // now we have our individual violations, as well as the main violations
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;

    double creditScore;
    double baselineRate = 300;


    // creating a method named display so that we can print the info in one fell swoop

    public void display(){
        System.out.println("This is what you have entered!");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Zip Code: " +zipCode);
        System.out.println("Your baseline rate is: " +baselineRate+ " dollars");
        System.out.println("Your baseline rate is calculated without taking the following into consideration: Age, Credit Score, Violations, and Residence");

    }

}
