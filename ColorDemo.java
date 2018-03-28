infoTAimport javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
* Lyft App keeps track of a Lyft driver's total pay for the day
*/
public class ColorDemo extends JPanel {

	/**
	* create the main LyftApp content pane
	*/
	    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

	public ColorDemo(){
		super();
		JPanel content = this;
		content.setLayout(new BorderLayout());
		//JPanel lyftFees = new JPanel();
		content.add(new JLabel("<html><h1>ColorDemo</h1></html>"),BorderLayout.PAGE_START);

		JPanel left = new JPanel();
		left.setLayout(new GridLayout(0,1));
		JTextField redTF = new JTextField("200");
		JTextField greenTF = new JTextField("225");
		JTextField blueTF = new JTextField("250");
		JButton go = new JButton("set color");
		left.add(new JLabel("Set RGB values (0-255)"));
		left.add(redTF);
		left.add(greenTF);
		left.add(blueTF);
		left.add(go);
		content.add(left,BorderLayout.LINE_START);

		JPanel center = new JPanel();
		center.setBackground(new Color(200,225,250));
		content.add(center,BorderLayout.CENTER);

		JLabel footer = new JLabel("The color has been set to (200,225,250)");
		content.add(footer,BorderLayout.PAGE_END);

		frame.setContentPane(content);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);

		go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int red = Integer.parseInt(redTF.getText().trim());
				int green = Integer.parseInt(greenTF.getText().trim());
				int blue = Integer.parseInt(blueTF.getText().trim());
				center.setBackground(new Color(red,green,blue));
				footer.setText(
				  "The color has been set to ("+red+","+green+","+blue+")"
				);
			}
		});

// everything from here down is BoilerPlate
// just replace "LyftApp" with your classes name!

	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("ColorDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new ColorDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }



}