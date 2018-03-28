import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SquareRootDemo{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Square Root Demo");
		JPanel content = new JPanel();

		JPanel center=new JPanel();
		center.setLayout(new GridLayout(3,2));
		JLabel enterB=new JLabel("Enter x");
		JLabel currentGuess=new JLabel("Current Guess g");
		JButton goB=new JButton("go");
		JTextField enterTF=new JTextField("25");
		JTextField currenGuessTF=new JTextField("1");
		JLabel formula=new JLabel("g=(g+x/g)/2");
		center.add(enterB);
		center.add(enterTF);
		center.add(currentGuess);
		center.add(currenGuessTF);
		center.add(goB);
		center.add(formula);
		content.add(center);

		goB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int x = Integer.parseInt(enterTF.getText().trim());
				int g = Integer.parseInt(currenGuessTF.getText().trim());
				int result=(g+x/g)/2;
				String response=""+result;
				currenGuessTF.setText(response);
			}
		});

		frame.setContentPane(center);
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);





		
	}
}