import java.util.Scanner;


public class dailySpecials {
    public static void main(String[] args){

        // Declare our variables
        String specials = "";
        // in the world of coffee, I need a name of a coffee bev and a price
        String coffee = "";
        double price = 0;
        // A scanner to input the day from the user
        Scanner input = new Scanner(System.in);

        // instead of specifically checking for Saturday or Sunday, I will just check to see if the entry-
        // is a valid weekday and if not then repeat the prompt
        // this will cover typos and gobbledygook entries too
        boolean valid = false;


        // The while loop will repeat until we have a valid weekday entry
        while (!valid){
            System.out.println("Please enter a weekday, not weekend: ");
            specials = input.next();
            // I wrote a separate method to change the case so that the first letter is capitalized and the rest is in lowercase
            specials = firstLetterCaps(specials);

            switch (specials) {
                // my cases will have a day of the week
                case "Monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                    valid = true;
                }
                case "Tuesday" -> {
                    coffee = "Frappe";
                    //price = 5.95;
                    price = 4.95;
                    valid = true;
                }
                case "Wednesday" -> {
                    coffee = "Cappuccino";
                    price = 4.35;
                    valid = true;
                }
                case "Thursday" -> {
                    coffee = "Regular Joe";
                    //price = 2.95;
                    price = 1.00;
                    valid = true;
                }
                case "Friday" -> {
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    valid = true;
                }
                default -> {
                    // Not sure that I need anything here...
                    // System.out.println("Invalid input. Please enter a valid weekday.");

                }
            } // end switch
        } //end while

        // I moved this out of the switch just to reduce the number of lines
        System.out.print(specials + "'s Coffee Of The Day is a " + coffee + " and the price will be $");
        System.out.printf("%.2f dollars%n", price);


        // we start taking the order here

        int qty;
        // I'm using constants to make the math more user-friendly when applying the discount
        final double DISCOUNT_10 = 0.90;
        final double DISCOUNT_20 = 0.80;


        Scanner order = new Scanner(System.in);
        System.out.println("How many " +coffee+ "s would you like to order?");
        qty = order.nextInt();

        if(qty == 0) {
            System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
        } else if (qty == 1) {
            System.out.print("Looks like you will be ordering only 1 " +coffee+ " today totalling $" );
            System.out.printf("%.2f dollars!",qty*price);
        } else if (qty > 1 && qty <5) {
            System.out.print(qty+ " " + coffee + "s have been ordered totalling $");
            System.out.printf("%.2f dollars!",qty*price);
        } else if (qty >=5 && qty <10) {
            System.out.print("Looks like you qualify for a group discount! Your regular price is $");
            System.out.printf("%.2f dollars.%n",qty*price);
            System.out.print("You have ordered " +qty+ " " + coffee + "s but will only be charged $");
            System.out.printf("%.2f dollars!",(qty*price)*DISCOUNT_10);
        } else if (qty >= 10) {
            System.out.print("You are getting the super group discount! Your regular price is $");
            System.out.printf("%.2f dollars.%n",qty*price);
            System.out.print("You have ordered " +qty+ " " + coffee + "s but will only be charged $");
            System.out.printf("%.2f dollars!",(qty*price)*DISCOUNT_20);
        } else {
            System.out.println("Sorry, I don't understand how many you want");
        }

    } // end main


    // This method will separate the input string (the day) into the first letter and remaining letters
    // The first letter gets capitalized, the remaining letters are set to lowercase
    // Concat them back together and return
    public static String firstLetterCaps(String specials){
        String specialsFirstLetter;
        String specialsAfterFirstLetter;

        specialsFirstLetter = specials.substring(0,1).toUpperCase();
        specialsAfterFirstLetter = specials.substring(1).toLowerCase();

        return specialsFirstLetter + specialsAfterFirstLetter;
    }

}
