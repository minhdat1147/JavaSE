package exercise2.question3;

public class HighSchoolStudent extends Student{
    private String clazz;
    private String desiredUniversity;

    public HighSchoolStudent(String clazz, String desiredUniversity) {
        super();
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    public HighSchoolStudent() {
        super.setId("1");
        super.setName("Nam");
        this.clazz = "Chuyên Văn";
        this.desiredUniversity = "Đại học công nghệ";
    }

    @Override
    public String toString() {
        return super.toString()+"HighSchoolStudent{" +
                "clazz='" + clazz + '\'' +
                ", desiredUniversity='" + desiredUniversity + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        System.out.println(highSchoolStudent.toString());
    }

}
