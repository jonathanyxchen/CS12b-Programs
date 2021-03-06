import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Registrar extends JPanel {

  private StudentBody students;

  public Registrar(){
    createGUI();
    students = new StudentBody("Brandeis");

    JFrame window = new JFrame("Registrar");
    window.setContentPane(this);
    window.setSize(400,400);
    window.setLocation(100,100);
    window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    window.setVisible(true);
  }

  private void createGUI(){
    JTextField nameTF = new JTextField();
    JTextField sageidTF = new JTextField();
    JTextField yearTF = new JTextField();
    JButton addB = new JButton("Add Student");
    JButton lookupB = new JButton("Lookup Student");
    JButton removeB = new JButton("Remove Student");
    JPanel content =this;
    content.setLayout(new GridLayout(0,2));
    content.add(new JLabel("name")); content.add(nameTF);
    content.add(new JLabel("sageid")); content.add(sageidTF);
    content.add(new JLabel("year")); content.add(yearTF);
    content.add(addB); content.add(lookupB); content.add(removeB);
    addB.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Student s = new Student(nameTF.getText(),sageidTF.getText(),yearTF.getText());
        students.addStudent(s);
      }
    });

    lookupB.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        String sageid = sageidTF.getText();
        Student s = students.studentMap.get(sageid);
        if (s==null){
          nameTF.setText("UNKNOWN");
          yearTF.setText("UNKNOWN");
        }else{
          nameTF.setText(s.getName());
          yearTF.setText(s.getYear());
        }
      }
    });

    removeB.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Student s = new Student(nameTF.getText(),sageidTF.getText(),yearTF.getText());
        students.removeStudent(s);
      }
    });
  }

  public static void main(String[] args){
    Registrar x = new Registrar();
  }
}

