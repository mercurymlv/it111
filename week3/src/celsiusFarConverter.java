public class celsiusFarConverter {
    public static void main(String[] args){
        // fahrenheit = (celsius * 9/5) + 32

        int cel, far;

        for(cel = 0; cel <= 100; cel = cel + 3){
            far = (cel * 9/5) + 32;
//            System.out.println(cel);
//            System.out.println(far);
            System.out.println(cel + " degrees Celsius is equal to " + far + " degrees Fahrenheit");

        } // end for loop

        System.out.println("All done!");

    }
}
