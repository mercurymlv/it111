import javax.swing. *;
import java.awt.*;

public class ShowWindow2 {
    public static void  main(String[] args){

        // declare our variables
        // make them CONSTANTS
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 400;


        // Create a window
        // similar to how we set up user inputs
        // scanner input = new Scanner(System.in);
        JFrame window = new JFrame();

        // set the title
        window.setTitle("Matthew's Simple Window");

        // set the size
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Set the location - I want it to be centered in the screen regardless of size/resolution
        // I googled this to get the screen size from the system
        // Source: https://stackoverflow.com/questions/2442599/how-to-set-jframe-to-appear-centered-regardless-of-monitor-resolution

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // my window's position coordinates
        int positionX, positionY;

        // ugh, I found out that I have to adjust for the size of the window itself
        // divide the window width/height by half and subtract so that the center of the window is centered
        // otherwise it's just the upper left corner that gets centered
        positionX = (screenSize.width / 2) - (window.getWidth() / 2);
        positionY = (screenSize.height / 2) - (window.getHeight() / 2);

        window.setLocation(positionX, positionY);


        // Set the background color of the window
        window.getContentPane().setBackground(Color.red);

        // Add the labels and input boxes
        JLabel myLabel = new JLabel("My First Big Label!!!");
        JLabel myLabel2 = new JLabel("My Second Big Label!!!");

        JTextField myTextField = new JTextField(10);
        JTextField myTextField2 = new JTextField(10);

        // Change font and size
        // Source: https://www.tabnine.com/code/java/methods/javax.swing.JComponent/setFont
        Font myFont = new Font("Aptos", Font.BOLD, 20);
        Font myFont2 = new Font("Times New Roman", Font.PLAIN, 18);

        myLabel.setFont(myFont);
        myLabel2.setFont(myFont2);


        // add the labels and boxes to the frame
        window.add(myLabel);
        window.add(myTextField);
        window.add(myLabel2);
        window.add(myTextField2);

        // I had to do a bit of research on layout
        // The .setLayout needs to be added even though its null, it doesn't work otherwise
        // Source: https://www.tutorialspoint.com/what-is-the-use-of-setbounds-method-in-java
        myLabel.setBounds(10, 10,200,30);
        myTextField.setBounds(10, 45,200,30);
        myLabel2.setBounds(10,90,200,30);
        myTextField2.setBounds(10, 125,200,30);

        window.setLayout(null);


        // close the window and exit
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // if we do not display the window it will not display!
        // displaying the window is a boolean
        window.setVisible(true);

    } // end main
}
