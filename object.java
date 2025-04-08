
public class Object {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Himanshu";
        s.roll_no=21;
        //call the display fntn in class student
        s.display();
       }
    
    }
     class Student
    {
        String name;
        int roll_no;
    
       void display()
       {
        System.out.println("Name: "+name);
        System.out.println("RollNo: "+roll_no);
    
       }
}