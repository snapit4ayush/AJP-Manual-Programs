import java.awt.*;
import java.awt.event.*;

public class Welcome extends Frame{
    Welcome()
    //Frame Settings
    {
        setSize(100,100);
        setVisible(true);
        setTitle("Welcome");
        setLayout(null); 
    
    //Component Creation
    Label l1 =new Label("Welcome To Java");

    //Set Location and Size Manually
    //l1.setBounds(x1,y1,x2,y2);
    l1.setBounds(25,25,100,100);
    
    //Adding Components
    add(l1);

    }
    
    public static void main(String[] args) {
        new Welcome();
    }
}
