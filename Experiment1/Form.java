import java.awt.*;
import java.awt.event.*;

public class Form extends Frame{
    Form(){
        // Frame Settings
        setSize(100,100);
        setVisible(true);
        setTitle("Form1");
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Component Creation
        Label l1=new Label("User Name");
        Label l2=new Label("Password");
        
        TextField t1= new TextField(40);
        TextField t2= new TextField(40);

        Button b1= new Button("Submit");

        // Component Adding
        add (l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        }); 
    }
    public static void main(String[] args) {
        new Form();

    }
}
