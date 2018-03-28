 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  When run as a program, this class opens a window on the screen that
 *  shows a large number of colored disks.  The positions of the disks
 *  are selected at random, and the color is randomly selected from
 *  red, green, or blue.  A black outline is drawn around each disk.
 *  The picture changes every three seconds.
 */
public class PA01 extends JPanel implements ActionListener {

    /**
     * Draws 500 disks with random colors and locations.
     * Each disk has a radius of 50 pixels.  This subroutine is
     * called every three seconds, giving a new set of disks.
     */
    public void drawFrame(Graphics g, int frameNumber, int width, int height) {

        int x=frameNumber%width;
        int y=frameNumber%height;
        g.setColor(new Color(0,0,frameNumber%255));
        g.fillRect(0,0,500,500);
        g.setColor(new Color(255,255,(frameNumber%255)));
        g.fillOval(x+356,y-345,3000/frameNumber,3000/frameNumber);
        g.fillOval(x-60,y+243,5000/frameNumber,5000/frameNumber);
        g.fillOval(x+234,y+236,7500/frameNumber,7500/frameNumber);
        g.fillOval(x-234,y-264,5000/frameNumber,5000/frameNumber);
        g.fillOval(x-453,y,6000/frameNumber,6000/frameNumber);
        g.fillOval(x-243,y+53,6000/frameNumber,6000/frameNumber);
        g.fillOval(x+12,y+142,6000/frameNumber,6000/frameNumber);
        g.fillOval(width/2+23,y-25,6000/frameNumber,6000/frameNumber);
        g.fillOval(x-234,height/2+64,5000/frameNumber,5000/frameNumber);
        g.fillOval(width/2-42,height-y+24,5000/frameNumber,5000/frameNumber);
        g.fillOval(width-x,height/2,5000/frameNumber,5000/frameNumber);
        g.fillOval(x+300,y-50,5000/frameNumber,5000/frameNumber);
        g.fillOval(x-250,y+340,5000/frameNumber,5000/frameNumber);
        g.setColor(Color.WHITE);
        Font tr = new Font("TimesRoman", Font.PLAIN, 18);
        g.setFont(tr);
        g.drawString("Space Travel Speed=" + frameNumber + "KM/H",10,25);
    }

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public static void main(String[] args) {

        /* NOTE:  The string in the following statement goes in the title bar
         * of the window.
         */
        JFrame window = new JFrame("Random Disks");

        /*
         * NOTE: If you change the name of this class, you must change
         * the name of the class in the next line to match!
         */
        PA01 drawingArea = new PA01();

        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);

        /* NOTE:  In the next line, the numbers 500 and 500 give the
         * initial width and height of the drawing array.  You can change
         * these numbers to get a different size.
         */
        drawingArea.setPreferredSize(new Dimension(500,500));

        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*
         * Note:  In the following line, you can change false to
         * true.  This will prevent the user from resizing the window,
         * so you can be sure that the size of the drawing area will
         * not change.  It can be easier to draw the frames if you know
         * the size.
         */
        window.setResizable(false);

        /* NOTE:  In the next line, the number 3000 gives the time between
         * calls to drawFrame().  The time is given in milliseconds, where
         * one second equals 1000 milliseconds.  You can change the number
         * to control the animation speed.
         */
        Timer frameTimer = new Timer(20,drawingArea);

        window.setVisible(true);
        frameTimer.start();

    } // end main

    private int frameNum;

    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }

}
