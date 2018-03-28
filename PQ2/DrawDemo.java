// first we import all of the classes we will use
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
* This demo creates a telephone keyboard of buttons.
*/
public class DrawDemo{
	public static void main(String[] args){

    JFrame window = new JFrame("DrawDemo");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("<html><h1>DrawDemo</h1></html>");
		content.add(label1,BorderLayout.PAGE_START);

		JButton lineB = new JButton("line");
		JButton ovalB = new JButton("oval");
		JButton boxB = new JButton("box");
		JTextField redTF = new JTextField("255"); //TF for textfield
		JTextField greenTF = new JTextField("255");
		JTextField blueTF = new JTextField("255");

		JPanel rightbar = new JPanel();
		rightbar.setLayout(new GridLayout(0,2));
		rightbar.add(new JLabel("red:"));rightbar.add(redTF);
		rightbar.add(new JLabel("green:"));rightbar.add(greenTF);
		rightbar.add(new JLabel("blue:"));rightbar.add(blueTF);
		content.add(rightbar,BorderLayout.LINE_END);

		JPanel leftbar = new JPanel();
		leftbar.setLayout(new GridLayout(3,0));
		leftbar.add(lineB);
		leftbar.add(ovalB);
		leftbar.add(boxB);
		content.add(leftbar,BorderLayout.LINE_START);

		JTextArea empty=new JTextArea(5,40);
		empty.setBackground(new Color(200,200,255));
		content.add(empty,BorderLayout.CENTER);

		
		JTextArea word=new JTextArea(5,40);
		word.setText(
			"We will have a canvas in the center.\n"+
			"This space if for your notes about your drawing\n"+
			"There are three buttons on the left and three textfields on the right\n"+
			"This is a text area and the panel above has color (200,200,255)"
			);




		content.add(word,BorderLayout.PAGE_END);


		window.setContentPane(content);
		window.pack();
		//window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
