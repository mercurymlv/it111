public class VariableScopeGlobal {

    final static String txt = "This is a GLOBAL variable of the VariableScopeGlobal class ";

    public static void main(String[] args){

        String txt = "This is the local variable in the main method!!!";
        System.out.println(txt);

        // We are going to print out the GLOBAL variable; take a look at how we call it
        System.out.println(VariableScopeGlobal.txt);

        // call sub
        sub();

    } // end main

    public static void sub(){
        String txt = "This is the local variable in the sub method";
        System.out.println(txt);
    } //end sub
}
