import javax.swing.JButton;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        ReadData.main(args);
       
        JFrame frame = Frame.frame;

       JButton Button=new JButton("CLick");
       frame.add(Button);
    }
}
