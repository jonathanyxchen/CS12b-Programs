// first we import all of the classes we will use
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PQ1a{
	public static void main(String[] args){

		JFrame window = new JFrame("PQ1a");
		JPanel content = new JPanel();
		JButton gButton = new JButton("G");
		JButton aButton = new JButton("A");
		JButton tButton = new JButton("T");
		JButton cButton = new JButton("C");
		JLabel title = new JLabel("PQ1a -- Demonstrating Layout Mastery                 Kingdom");
		JLabel end = new JLabel("Searching for: GGTATGCCACA");
		//JLabel Kingdom = new JLabel("Kingdom");
		String[] kingdom= {"animal","plant","bacteria","virus"};
		JComboBox kingDropdown = new JComboBox(kingdom);

		JPanel box2x2 = new JPanel();
		box2x2.setLayout(new GridLayout(2,2)); //GridLayout出现在另一个的小窗口里面
		box2x2.add(gButton);
		box2x2.add(tButton);
		box2x2.add(aButton);
		box2x2.add(cButton);

		JPanel top = new JPanel();
		top.setLayout(new BorderLayout());
		top.add(title,BorderLayout.LINE_START);
		top.add(kingDropdown);

		content.setLayout(new BorderLayout());
		content.add(top,BorderLayout.PAGE_START);
		content.add(box2x2);
		content.add(end, BorderLayout.PAGE_END);

		window.setContentPane(content);
		window.setSize(500,350);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
