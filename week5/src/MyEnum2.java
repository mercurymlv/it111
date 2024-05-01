public class MyEnum2 {

    enum Wines {CABERNET, MERLOT, SYRAH}

    public static void main(String[] args){

        Wines choose = Wines.MERLOT;

        // System.out.println(choose);

        switch(choose) {
            case CABERNET:
                System.out.println("Love my Washington cabernets!");
                break;

            case MERLOT:
                System.out.println("The main character in Sideways did not like merlot");
                break;

            case SYRAH:
                System.out.println("I like some syrahs");
                break;

            default:
                System.out.println("Invalid Input");

        } // end switch



    } // end main
}
