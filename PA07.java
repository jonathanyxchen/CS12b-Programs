import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PA07{
	public static void main(String[] args){
		Map<String,String> phoneBook = new TreeMap<String,String>();
		Map<String,String> reversePhoneBook = new TreeMap<String,String>();

		JFrame frame = new JFrame("PhoneBook");
		JPanel content = new JPanel();
		content.setLayout(new GridLayout(4,2));
		JLabel label = new JLabel("<html><h1>Digital Phone Book!</h1></html>");
		JPanel empty1 = new JPanel();
		JPanel empty2 = new JPanel();
		JPanel buttons = new JPanel();
		JButton saveB = new JButton("save");
		JButton lookupB = new JButton("lookup");
		buttons.add(saveB);
		buttons.add(lookupB);
		JLabel name = new JLabel("Name:");
		JTextField nameTF = new JTextField("Tim");
		JLabel phone = new JLabel("Phone:");
		JTextField phoneTF = new JTextField("781-736-2706");
		content.add(label);
		content.add(empty1);
		content.add(empty2);
		content.add(buttons);
		content.add(name);
		content.add(nameTF);
		content.add(phone);
		content.add(phoneTF);

		saveB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String nameInput = nameTF.getText();
				String phoneInput = phoneTF.getText();
				phoneBook.put(nameInput, phoneInput);
				reversePhoneBook.put(phoneInput, nameInput);
			}
		});

		lookupB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (nameTF.getText().length()!=0 && phoneBook.get
				(nameTF.getText())!=null && phoneTF.getText().length()==0){
					phoneTF.setText(phoneBook.get(nameTF.getText()));
				} else if(nameTF.getText().length()!=0 && phoneBook.get
				(nameTF.getText())==null && phoneTF.getText().length()==0){
						phoneTF.setText("unknown");
				} else if (phoneTF.getText().length()!=0 && reversePhoneBook.get
				(phoneTF.getText())!=null && nameTF.getText().length()==0){
						nameTF.setText(reversePhoneBook.get(phoneTF.getText()));
				} else if (phoneTF.getText().length()!=0 && reversePhoneBook.get
				(phoneTF.getText())==null && nameTF.getText().length()==0) {
						nameTF.setText("unknown");
				}
			}
		});

		frame.setContentPane(content);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);
	}
}