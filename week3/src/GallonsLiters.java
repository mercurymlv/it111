public class GallonsLiters {
    public static void main(String[] args){

        // Gallons to Liters converter
        // 1 Gallon = 3.78541 Liters

        double gallons, liters;
        int counter = 1;

        for(gallons = 1; gallons <= 100; gallons += 4){
            liters = gallons * 3.78541;
            System.out.print("Liters ");
            System.out.printf("%.2f",liters);
            System.out.print(" = ");
            System.out.printf("%.2f",gallons);
            System.out.println(" Gallons");

            // Use IF and a counter to add a blank line after each block of 5 lines
            // Use modulus to figure out if the counter is a multiple of 5 (i.e. remainder will be zero)
            if(counter % 5 == 0){
                System.out.println("");
            } // end if
            counter++;
        } // end for

        System.out.println("We are done!!!!");

    } // end main

}
