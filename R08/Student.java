public class Student{
  public String name;
  public String id;
  public String year;

  public Student(String name, String id, String year){
    this.name=name;
    this.id=id;
    this.year=year;
  }

  public String toString(){
    return "Student("+this.name+","+this.id+","+this.year+")";
  }

  public static void main(String[] args){
    Student[] list = new Student[3];
       Student x = new Student("Timothy Hickey","S123467890","Spr20");
       Student y = new Student("Gustavo Li","S9876543210","Spr20");
       Student z = new Student("Jialin Martine","S8989898989","Fall19");
       list[0]=x; list[1]=y; list[2]=z;
       for(int i=0; i<list.length; i++){
         System.out.println(list[i]);
       }
  }
}
