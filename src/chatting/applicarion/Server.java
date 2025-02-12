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
        
        
        // present inside JFrame class and is used to set the size of the frame
        setSize(450, 450); //setSize(int width, int height)
        
        // set the location of the frame by default it opens on the top-left corner 
        setLocation(300, 150); //setLocation(int x-axis, int y-axis)
        
        // used to select a particular part or the complete frame and make necessary changes to it like adding colors or buttons etc.
        getContentPane().setBackground(Color.WHITE); // setting the background color by selecting the complete frame with getContentPane();
        
        // by default visiblity of frame is set to hidden this function helps to display the function
        setVisible(true); // keeping it last so that frame is available only after all the changes are made
    }
    
    public static void main (String args[]) // main method called immediately after running the class
    {
        
        // anpnymous object which will call the constructor which contains our frame coding
        new Server(); 
    }
}
