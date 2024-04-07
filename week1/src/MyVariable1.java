public class MyVariable1 {

    public static void main (String[] args) {
        String name = "Matthew"; // I remembered the semi-colon! Yay!
        int hours = 40; // We are assigning a value of 40 to hours
        // String values are contained in double-quotes
        // No quotes for numbers/integers
        System.out.println(name);
        System.out.println(hours);

//        String building, tree, lake, ocean;
//        building = "Golden Gate Bridge";
//        tree = "Western Hemlock";
//        lake = "Crescent Lake";
//        ocean = "Pacific Ocean";

        String building = "Golden Gate Bridge", tree = "Western Hemlock", lake = "Crescent Lake", ocean = "Pacific Ocean";

//        int weeks, decades, months, years;
//        weeks = 4;
//        decades = 10;
//        months = 3;
//        years = 5;

        int weeks = 4, decades = 10, months = 3, years = 5;

//        Choosing between the 2 styles is personal preference

        System.out.println(building);
        System.out.println(tree);
        System.out.println(lake);
        System.out.println(ocean);
        System.out.println(weeks);
        System.out.println(decades);
        System.out.println(months);
        System.out.println(years);

        boolean dry = true;

        if(dry){
            System.out.println("Time to hand up those curtins!");
        } else {
            System.out.println("We will have to wait a spell!");
        }



    }
}
