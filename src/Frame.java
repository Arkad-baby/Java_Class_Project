import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Frame extends JFrame {
    public static JFrame frame;
    
    public Frame() {
        frame.setSize(400, 300); // Setting the size of the static frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting the default close operation
        
        JLabel hii = new JLabel("Hello"); // Creating a JLabel with text "Hello"
        frame.add(hii); // Adding the JLabel to the static frame
        frame.setLayout(new FlowLayout());
        frame.setVisible(true); // Making the static frame visible
    }
    public static void main(String[] args) {
        frame=new Frame();
    }
    }

