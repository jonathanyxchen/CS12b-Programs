import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LyftRideCalculator{
	public static void main(String[] args) {
		JFrame frame = new JFrame("LyftRide");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		JLabel label=new JLabel("<html><h1>Lyft Ride Calculator</h1></html>");
		label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		content.add(label,BorderLayout.PAGE_START);

		JPanel leftbar=new JPanel();
		leftbar.setLayout(new GridLayout(4,1));
		JLabel pickupFee=new JLabel("pickup fee: $5");
		JLabel distanceFee=new JLabel("distance fee: $3/mile");
		JLabel timeFee=new JLabel("time fee: $0.20/minute");
		leftbar.add(pickupFee);
		leftbar.add(distanceFee);
		leftbar.add(timeFee);
		content.add(leftbar,BorderLayout.LINE_START);

		JPanel center=new JPanel();
		center.setLayout(new GridLayout(3,2));
		JLabel rideDistance = new JLabel("ride distance in miles:");
		JLabel rideTime=new JLabel("ride time in minutes");
		JLabel pay=new JLabel("pay for the ride");
		JTextField rideDistanceTF=new JTextField("2");
		JTextField rideTimeTF=new JTextField("10");
		JLabel amount=new JLabel("$13.0");
		center.add(rideDistance);
		center.add(rideDistanceTF);
		center.add(rideTime);
		center.add(rideTimeTF);
		center.add(pay);
		center.add(amount);
		center.setBackground(Color.YELLOW);
		content.add(center,BorderLayout.CENTER);

		JPanel rightbar=new JPanel();
		rightbar.setLayout(new GridLayout(1,0));
		JButton calculatePayB=new JButton("calculate pay");
		rightbar.add(calculatePayB);
		content.add(rightbar,BorderLayout.LINE_END);

		JPanel bottom=new JPanel();
		bottom.setLayout(new GridLayout(1,0));
		JLabel formula=new JLabel("pay is calculated by 5 + 3*dist + 0.2*time");
		bottom.add(formula);
		content.add(bottom,BorderLayout.PAGE_END);

		calculatePayB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double dist = Double.parseDouble(rideDistanceTF.getText().trim());
				double time = Double.parseDouble(rideTimeTF.getText().trim());
				double result=5 + 3*dist + 0.2*time;
				String response="$"+result;
				amount.setText(response);
			}
		});

		frame.setContentPane(content);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);
		
	}
}