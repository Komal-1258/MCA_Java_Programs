class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public void showStudentDetails() {
        display();
        System.out.println("Course: " + course);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void showTeacherDetails() {
        display();
        System.out.println("Teaches: " + subject);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "Computer Science");
        Teacher teacher1 = new Teacher("Mr. John", 40, "Mathematics");

        System.out.println("Student Details:");
        student1.showStudentDetails();

        System.out.println("\nTeacher Details:");
        teacher1.showTeacherDetails();
    }
}
