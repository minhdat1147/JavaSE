
public class Test extends Student {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Jason",(byte)22,8.0);
        Student student2 = new Student();
        System.out.println("Enter student information: ");
        student2.input();
        System.out.println("--STUDENT LIST--");
        System.out.println(student1);
        System.out.println(student2);
    }
}