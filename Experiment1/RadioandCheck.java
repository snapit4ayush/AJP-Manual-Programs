import java.awt.*;
import java.awt.event.*;
class RadioandCheck {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setSize(100,100);
        f.setVisible(true);
        f.setTitle("RadioandCheck");
        // BorderLayout is default in Frame
        //FlowLAyout is default in applet
        f.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Checkbox
        Checkbox cb1 = new Checkbox("JAVA PROGRAMS");
        Checkbox cb2 = new Checkbox("JAVA",true);
        
        // RadioButtons
        CheckboxGroup cbg = new CheckboxGroup();
        CheckboxGroup mf = new CheckboxGroup();
        Checkbox cb3 = new Checkbox("JAVA PROGRAMS",false,cbg);
        Checkbox cb4 = new Checkbox("JAVA",true,cbg);
        Checkbox cb5 = new Checkbox("MALE",false,mf);
        Checkbox cb6 = new Checkbox("FEMALE",false,mf);

        //Adding Component
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        f.add(cb6);

        

        //closing
        f.addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                f.dispose();  
            }  
        });  
    }
}