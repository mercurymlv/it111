import java.util.Scanner;

public class TryCatchint {
    public static void main(String[] args){

        System.out.println("Please enter a number: ");

        // I am trying my code in the try block
        try {
            int i;
            Scanner input = new Scanner(System.in);
            i = input.nextInt();

            System.out.println("Your integer is: " +i);

        // if there are problems it will render in the catch block
        } catch (Exception e){
            System.out.println("We have an error: " +e);
        }

//        System.out.println("The code ran correctly!");

    } //end main
}
