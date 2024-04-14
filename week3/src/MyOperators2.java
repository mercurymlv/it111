public class MyOperators2 {

    public static void main(String[] arg){

        //boolean operators


//        boolean tuna = true;
//        boolean bread = true;
//
//        if(tuna == true && bread == true) {
//            System.out.println("We are having a sandwich!");
//        } else {
//            System.out.println("We are not!");
//        }

        boolean tuna = false;
        boolean bread = false;

        if(tuna == true || bread == true) {
            System.out.println("We are having some food products!");
        } else{
            System.out.println("We will not be eating any food today ;(");
        }


        // Drinking age check!

        int age = 19;

        if(age >= 18){
            System.out.println("Yippy Skippy! We can order an adult beverage!");
        } else{
            System.out.println("We will have a diet coke");
        }


        // Roller coaster height requirement

        float height = 4F;

        if(height < 4){
            System.out.println("You will not be able to ride the roller coaster");
        } else{
            System.out.println("Have a great time! Welcome aboard the roller coaster!");
        }


    }
}
