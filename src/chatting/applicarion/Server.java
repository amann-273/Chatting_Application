// intructing our JVM that this class Server comes under the package of chatting 
package chatting.applicarion;  

// swing package from javax contains the JFrame class
import javax.swing.*;

// awt class contains the color class
import java.awt.*;

// event class is used to implement the ActionListener interface
import java.awt.event.*;

public class Server extends JFrame implements ActionListener // JFrame is used for creating our frame & ActionListener interface is used to handle action events like button clicks etc
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
        
        // class from swing package helps with loading, storing setting and displaying of images in GUI
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png")); // method to recieve a resourrce omage from the path defined
        
        // class from swing package commonly used for image manipulation and rendering i.e handling and processing
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT); // getImage() -> extracts image from the imageicon  getScaledInstance is use to scale the image
        
        // image icon cannot be diectly set on the frame so JLabel will be used
        ImageIcon i3 = new ImageIcon(i2); // passing Image i2 into ImageIcon so that it can be directly used in the JLabel
        JLabel back = new JLabel(i3); // passing the image in the object argument to load image in JLabel
        back.setBounds(5,20, 25, 25); // setting loation of the back icon image
        p1.add(back); // this will add the back icon image on the panel if we would have done only "add(back)" it would have been added to the frame not the panel 
        
        // we want the closing of the frame whe the back photo is clicked this is a click event
        back.addMouseListener(new MouseAdapter() // addMouseListener is used for the mouse event listener detecting mouse actions, MiuseAdapter is an abstract class providing empty implementations for the MouseListener interface
        {
            public void mouseClicked(MouseEvent ae) // mouseClicked method is overriden 
            {
                setVisible(false); // closes the frame
                //System.exit(0);  // closing the project
            }
        });
        
        // copied the above code for the image, code will be the same
        
        //profile image
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40,10, 50, 50);
        p1.add(profile);
        
        // video image
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(300, 20, 30, 30);
        p1.add(video);
        
        // phone image
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(350, 20, 30, 30);
        p1.add(phone);
        
        // morevert image
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel morevert = new JLabel(i15);
        morevert.setBounds(400, 20, 10, 25);
        p1.add(morevert);
        
        // displaying the name
        JLabel name = new JLabel("Aman");
        name.setBounds(110, 15, 100, 18);
        name.setForeground(Color.WHITE); // setting the foreground color on the text just like background color
        name.setFont(new Font("SANS_SERIF", Font.BOLD, 18)); // setting the font family type ad size
        p1.add(name);
        
        // displaying the status
        JLabel status = new JLabel("Active now");
        status.setBounds(110, 35, 100, 18);
        status.setForeground(Color.WHITE); // setting the foreground color on the text just like background color
        status.setFont(new Font("SANS_SERIF", Font.BOLD, 14)); // setting the font family type ad size
        p1.add(status);
        
        JPanel a1 = new JPanel(); // new panel for text and other components
        a1.setBounds(5,75,425,570);
        add(a1);
        
        JTextField text = new JTextField(); // helps in tsking text input from user
        text.setBounds(5, 655, 310, 40);
        text.setFont(new Font("SANS_SERIF", Font.PLAIN, 16));
        add(text);
        
        JButton send = new JButton("Send");
        send.setBounds(320, 655, 123, 40);
        send.setBackground(new Color(7, 94,84));
        send.setForeground(Color.WHITE);
        add(send);
        
        // present inside JFrame class and is used to set the size of the frame
        setSize(450, 700); //setSize(int width, int height)
        
        // set the location of the frame by default it opens on the top-left corner 
        setLocation(200, 50); //setLocation(int x-axis, int y-axis)
        
        //setUndecorated(true); // remove the header of the frame and increase its size
        
        // used to select a particular part or the complete frame and make necessary changes to it like adding colors or buttons etc.
        getContentPane().setBackground(Color.WHITE); // setting the background color by selecting the complete frame with getContentPane();
        
        // by default visiblity of frame is set to hidden this function helps to display the function
        setVisible(true); // keeping it last so that frame is available only after all the changes are made
    }
    
    public void actionPerformed(ActionEvent ae) // overrriding the abstract method which is already present in the ActionListener interface
    {
        
    }
    
    public static void main (String args[]) // main method is called immediately after running the class
    {
        
        // anpnymous object which will call the constructor which contains our frame coding
        new Server(); 
    }
}
