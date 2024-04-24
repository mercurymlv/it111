import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args){

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week (except weekends) Monday thru Friday: ");
        specials = input.next();
        //    input.close();

        // in the world of coffee, I need a name of a coffee bev and a price
        String coffee;
        double price;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday){
            System.out.println("Please enter a weekday, not weekend: ");
            specials = input.next();
        } //end if


        switch (specials) {
            // my cases will have a day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s Coffee Of The Day is a " + coffee + " and the price will be $" + price);
            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
                System.out.println(specials + "'s Coffee Of The Day is a " + coffee + " and the price will be $" + price);
            }
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s Coffee Of The Day is a " + coffee + " and the price will be $" + price);
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s Coffee Of The Day is a " + coffee + " and the price will be $" + price);
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s Coffee Of The Day is a " + coffee + " and the price will be $" + price);

                // default:
                // System.out.println("Please enter a valid day or check your spelling");
            }
        } // end switch


    } // end main

}
