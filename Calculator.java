import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		JPanel lyftFees = new JPanel();
		content.add(new JLabel("<html><h1>Calculator</h1></html>"),BorderLayout.PAGE_START);

		JPanel center=new JPanel();
		center.setLayout(new GridLayout(0,1));
		JTextField firstNumber=new JTextField();
		JTextField secondNumber=new JTextField();
		JButton addB=new JButton("add");
		JButton multiplyB=new JButton("multiply");
		center.add(firstNumber);
		center.add(secondNumber);
		center.add(addB);
		center.add(multiplyB);
		content.add(center,BorderLayout.CENTER);

		JLabel bottom=new JLabel();
		content.add(bottom,BorderLayout.PAGE_END);

		frame.setContentPane(content);
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);

		addB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numberone = Integer.parseInt(firstNumber.getText().trim());
				int numbertwo = Integer.parseInt(secondNumber.getText().trim());
				int sum=numberone+numbertwo;
				bottom.setText("The result is "+sum);

			}
		});

		multiplyB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numberone = Integer.parseInt(firstNumber.getText().trim());
				int numbertwo = Integer.parseInt(secondNumber.getText().trim());
				int product=numberone*numbertwo;
				bottom.setText("The result is "+product);

			}
		});



		
	}
}