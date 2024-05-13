import java.io.File;

import static java.lang.System.out;

public class MyFiles2 {
    public static void main(String[] args){
        // because it was manually imported, we get abbv form:
        // out.println();

        File dir = new File("NewFolder");

        // start with if-else statement
        if(dir.exists()){
            // we are going to be happy!
            // this is where we are going to call out our array
            String[] files = dir.list();

            // a new keyword: assert
            assert files != null;
            out.println(files.length + " files found!");

            // we would like to see those files with a for loop
            for (int i = 0; i < files.length; i++){
                out.println(files[i]);
            }


        } else {
            // we are going to be sad :(
            out.println("Directory does not exist!");
        }

    } // end main
}
