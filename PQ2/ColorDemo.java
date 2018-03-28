t// first we import all of the classes we will use
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
* This demo creates a telephone keyboard of buttons.
*/
public class ColorDemo{
	public static void main(String[] args){

    JFrame window = new JFrame("ColorDemo");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		JButton setB = new JButton("set color"); //B for button
		JTextField redTF = new JTextField("200"); //TF for textfield
		JTextField greenTF = new JTextField("125");
		JTextField blueTF = new JTextField("150");
		JLabel label1 = new JLabel("<html><h1>ColorDemo</h1></html>");
		JLabel label2 = new JLabel("The color has been set to (200, 125, 150)");
		JTextArea color = new JTextArea(5,40);
		color.setBackground(new Color(200,125,150));
		content.add(label1,BorderLayout.PAGE_START);
		content.add(label2,BorderLayout.PAGE_END);

		JPanel input = new JPanel();
		input.setLayout(new GridLayout(5,0));
		input.add(new JLabel("Set RGB values (0-255)"));
		input.add(redTF);
		input.add(greenTF);
		input.add(blueTF);
		input.add(setB);
		content.add(input,BorderLayout.LINE_START);
		content.add(color);


		setB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				String redText = redTF.getText();
				String greenText = greenTF.getText();
				String blueText = blueTF.getText();
				int redNumber = Integer.parseInt(redText);
				int greenNumber = Integer.parseInt(greenText);
				int blueNumber = Integer.parseInt(blueText);

				color.setBackground(new Color(redNumber,greenNumber,blueNumber));
				String answer = "The color has been set to (" + redText + "," + greenText
					+ "," + blueText + ")";
				label2.setText(answer);


			}
		});


		window.setContentPane(content);
		window.pack();
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
