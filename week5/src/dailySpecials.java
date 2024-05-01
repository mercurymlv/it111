import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args){

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week (except weekends) Monday thru Friday: ");
        specials = input.next();
        //    input.close();

        // in the world of coffee, I need a name of a coffee bev and a price
        // I was getting an error that coffee and price were "not initiated"
        // I googled this and I think it's because they are only assigned in the switch statement
        // so I just gave them default values
        String coffee = "";
        double price = 0;

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
            }
            default -> {
                System.out.println("Please enter a valid day or check your spelling");
                // I had to google this one...otherwise it continued to ask for quantity
                return;
            }
        } // end switch

        // we start taking the order here

        int qty;
        double total;

        Scanner order = new Scanner(System.in);
        System.out.println("How many " +coffee+ "s would you like to order?");
        qty = order.nextInt();

        if(qty == 0) {
            System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");
        } else if (qty == 1) {
            System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
        } else if (qty > 1) {
            System.out.print(qty+ " " + coffee + "s have been ordered totalling $");
            System.out.printf("%.2f dollars!",qty*price);
        } else {
            System.out.println("Sorry, I don't understand how many you want");
        }

    } // end main

}
