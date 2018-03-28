// first we import all of the classes we will use
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
* This demo creates a telephone keyboard of buttons.
*/
public class PQ1b{
	public static void main(String[] args){

    JFrame window = new JFrame("PQ1b");
		JPanel content = new JPanel();
		JButton goB = new JButton("go"); //B for button
		JButton clearB = new JButton("clear");
		JTextField number1TF = new JTextField("55"); //TF for textfield
		JTextField number2TF = new JTextField("23");
		JLabel answer = new JLabel("The sum of 55 and 23 is 78 and the difference is 32");

		JPanel box2x1 = new JPanel();
		box2x1.setLayout(new GridLayout(0,2));
		box2x1.add(goB);
		box2x1.add(clearB);

		content.setLayout(new FlowLayout());
		content.add(new JLabel("Enter in two integers:"));
		content.add(number1TF);
		content.add(number2TF);
		content.add(box2x1);
		content.add(answer);


		clearB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				number1TF.setText("");
				number2TF.setText("");
			}
		});

		goB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				String number1Text = number1TF.getText();
				String number2Text = number2TF.getText();
				int number1 = Integer.parseInt(number1Text);
				int number2 = Integer.parseInt(number2Text);

				int sum = number1 + number2;
				int difference = number1 - number2;
				String response = "The sum of " + number1 + " and " + number2
						+ " is " + sum + " and the difference is " + difference;
				answer.setText(response);
			}
		});


		window.setContentPane(content);
		window.pack();
		window.setSize(400,200);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
