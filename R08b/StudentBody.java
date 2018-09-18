import java.util.*;


public class StudentBody {
  public Map<String,Student> studentMap;
  public String schoolName;

  public StudentBody(String name){
    this.schoolName = name;
    this.studentMap = new TreeMap<String,Student>();
  }
  // add the two instance methods -- addStudent and removeStudent
  public void addStudent(Student s){
    studentMap.put(s.getId(),s);
  }
  public void removeStudent(Student s){
    studentMap.put(s.getId(),null);
  }
  public void printStudents(){
    System.out.println("Students at "+this.schoolName);
    Set<String>studentIds = studentMap.keySet();
    for(String studentId: studentIds){
      System.out.println(studentMap.get(studentId));
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
