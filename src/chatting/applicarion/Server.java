// intructing our JVM that this class Server comes under the package of chatting 
package chatting.applicarion;  

// swing package from javax contains the JFrame class
import javax.swing.*;

// awt class contains the color class
import java.awt.*;

public class Server extends JFrame // JFrame is used for creating our frame
{
    Server() // all coding of the frame will be done inside this constructor
    {
        // used to set layout of the frame like adding images, texts and other components swing already has many inbuilt layouts and can be used through this function
        setLayout(null); // instructing the machine that I will be designing my custom layout
        
        // used to perform actions on the frame, a way to arrange and structure UI elements 
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7,94,84)); // setting the background colour of the panel  
        
        // add() function will not show any results as setlayout is null
        // this function helps us to place the panel or any componets as per our choice 
        p1.setBounds(0, 0, 450, 70); // setBounds(int x, int y, int width, int height) where x & y are top left corners
        p1.setLayout(null); // our image in this panel has not picked the setBounds location becase the layout was not null, it will work correctly
        // using this function we can add components on the frame
        add(p1); //addng the panel on the frame
        
        // class from swing package helps in handling images like setting 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png")); // method to recieve a resourrce omage from the path defined
        
        // class from swing package 
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT); // getImage() -> extracts image from the 
        
        // image icon cannot be diectly set on the frame so JLabel will be used
        JLabel back = new JLabel(i1); // passing the image in the object argument to load image in JLabel
        back.setBounds(5,20, 25, 25); // setting loation of the back icon image
        p1.add(back); // this will add the back icon image on the panel if we would have done only "add(back)" it would have been added to the frame not the panel 
        
        
        // present inside JFrame class and is used to set the size of the frame
        setSize(450, 450); //setSize(int width, int height)
        
        // set the location of the frame by default it opens on the top-left corner 
        setLocation(300, 150); //setLocation(int x-axis, int y-axis)
        
        // used to select a particular part or the complete frame and make necessary changes to it like adding colors or buttons etc.
        getContentPane().setBackground(Color.WHITE); // setting the background color by selecting the complete frame with getContentPane();
        
        // by default visiblity of frame is set to hidden this function helps to display the function
        setVisible(true); // keeping it last so that frame is available only after all the changes are made
    }
    
    public static void main (String args[]) // main method is called immediately after running the class
    {
        
        // anpnymous object which will call the constructor which contains our frame coding
        new Server(); 
    }
}
