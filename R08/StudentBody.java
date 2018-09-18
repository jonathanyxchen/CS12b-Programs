import java.util.ArrayList;
import java.util.List;


public class StudentBody {
  public List<Student> studentList;
  public String schoolName;

  public StudentBody(String name){
    this.schoolName = name;
    this.studentList = new ArrayList<Student>();
  }
  // add the two instance methods -- addStudent and removeStudent
  public void addStudent(Student s){
    studentList.add(s);
  }
  public void removeStudent(Student s){
    studentList.remove(s);
  }
  public void printStudents(){
    System.out.println("Students at "+this.schoolName);
    for(int i=0; i<studentList.size(); i++){
      System.out.println(studentList.get(i));
    }
  }

  public static void main(String[] args){
    Student x = new Student("Timothy Hickey","S123467890","Spr20");
    Student y = new Student("Gustavo Li","S9876543210","Spr20");
    Student z = new Student("Jialin Martine","S8989898989","Fall19");
    StudentBody body = new StudentBody("Brandeis");
    body.addStudent(x);
    body.addStudent(y);
    body.addStudent(z);
    body.printStudents();
    System.out.println("Removing Gustavo");
    body.removeStudent(y);
    body.printStudents();
  }
}
