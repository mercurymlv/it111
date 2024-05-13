import java.io.File;

public class MyFile {
    public static void main(String[] args){
        // we are going to create a file object

        File dir = new File("\\Users\\Matthew\\OneDrive\\Documents\\School\\IT 111 Programming Fundamentals\\IdeaProjects\\it111\\week7");

        // create an if-else statement
        // if dir exists, yay! else, not a good thing
        if (dir.exists()){
            System.out.println("Yippy Skippy! We have a directory!");
        }else{
            System.out.println("We are lost in space! We do not know where that directory is.");
        }



    } // end main
}
