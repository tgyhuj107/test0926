import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame{
    private Container cp;

    public mainFrame (){
        init();
    }
    public void init(){
        this.setBounds(400,400,400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setBackground(new Color(166,255, 70));
    }
}
