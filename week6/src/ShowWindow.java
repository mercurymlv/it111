import javax.swing. *;

public class ShowWindow {
    public static void  main(String[] args){

        // declare our variables
        // make them CONSTANTS
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        // Create a window

        // similar to how we set up user inputs
        // scanner input = new Scanner(System.in);
        JFrame window = new JFrame();

        // set the title
        window.setTitle("My Simple Window");

        // set the size
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // if we do not display the window it will not display!
        // displaying the window is a boolean
        window.setVisible(true);

    } // end main
}
