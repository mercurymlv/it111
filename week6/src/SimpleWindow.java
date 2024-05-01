import javax.swing.*;

public class SimpleWindow extends JFrame {
    // Because of extends, I will not have a main method in this class
    // Constructor - a special method that displays our attributes

    public SimpleWindow(){

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        setTitle("My Second Simple Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(500,200);

        // Don't forget to display!
        setVisible(true);


    }




}
