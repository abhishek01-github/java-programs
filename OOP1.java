public class OOP1 {
    public static void main(String[] args) {
        Student s1 = new Student(30,"Abhishek",70);
        System.out.println(s1.marks);
        Student s2 = new Student();
        System.out.println(s2.name);
    }
}
class Student{
    int roll;
    String name;
    int marks;

    Student(int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    Student(){
        this(0, "random", 0);
    }
}