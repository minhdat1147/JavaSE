package exercise2.question3;

public class Student extends Person{
    private String id;
    public Student(){
        super();
    }

    public Student(String id) {
        super();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "id='" + id + '\'' +
                '}';
    }
}
