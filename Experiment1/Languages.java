import java.awt.*;

public class Languages extends Frame{
    Languages()
    {
        //Frame Settings
        setVisible(true);
        setSize(100,100);
        setTitle("Languages");
        setLayout(new GridLayout());
        //setLayout(new GridLayout(rows,columns,hgap,vgap));

        // Component Creation
        Checkbox cb1= new Checkbox("English");
        Checkbox cb2= new Checkbox("Hindi");
        Checkbox cb3= new Checkbox("Marathi");
        Checkbox cb4= new Checkbox("Sanskrit");

        //Adding components
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);


    }
    public static void main(String[] args) {
        new Languages();
    }
}
