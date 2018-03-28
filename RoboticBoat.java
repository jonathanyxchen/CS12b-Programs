import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RoboticBoat{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Robotic Boat");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		JLabel label=new JLabel("<html><h1>Navigate the robotic boat</h1></html>");
		label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		content.add(label,BorderLayout.PAGE_START);

		JPanel center=new JPanel();
		center.setLayout(new GridLayout(3,3));
		JButton NWB=new JButton("NW");
		JButton WB=new JButton("W");
		JButton SWB=new JButton("SW");
		JButton NB=new JButton("N");
		JButton OB=new JButton("O");
		JButton SB=new JButton("S");
		JButton NEB=new JButton("NE");
		JButton EB=new JButton("E");
		JButton SEB=new JButton("SE");
		center.add(NWB);
		center.add(WB);
		center.add(SWB);
		center.add(NB);
		center.add(OB);
		center.add(SB);
		center.add(NEB);
		center.add(EB);
		center.add(SEB);
		content.add(center,BorderLayout.CENTER);

		JPanel rightbar=new JPanel();
		rightbar.setLayout(new GridLayout(2,0));
		JButton GoB=new JButton("Go");
		JButton StopB=new JButton("Stop");
		rightbar.add(GoB);
		rightbar.add(StopB);
		content.add(rightbar,BorderLayout.LINE_END);

		JPanel bottom=new JPanel();
		JLabel name=new JLabel("Your name:");
		JTextField nameTF= new JTextField("...enter your name in this textfield...");
		bottom.add(name);
		bottom.add(nameTF);
		content.add(bottom,BorderLayout.PAGE_END);

		frame.setContentPane(content);
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);





		
	}
}