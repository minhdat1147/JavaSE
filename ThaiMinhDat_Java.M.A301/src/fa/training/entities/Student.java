package fa.training.entities;

import java.util.Scanner;

public class Student extends Person{
    private String studentId;
    private double theory;
    private double practice;
    public Student(){
        super();
    }

    @Override
    public void purchasePakingPass() {

    }

    public Student(String studentId, double theory, double practice) {
        super();
        this.studentId = studentId;
        this.theory = theory;
        this.practice = practice;
    }

    public String getStudentId() {
        return studentId;
    }


    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getTheory() {
        return theory;
    }

    public boolean setTheory(double theory) {
        if(theory >=0 && theory <=10){
            this.theory = theory;
            return true;
        }else{
            System.err.println("enter again (theory range 0 to 10)");
            return false;
        }
    }

    public double getPractice() {
        return practice;
    }

    public boolean setPractice(double practice) {
        if(practice >=0 && practice <=10){
            this.practice = practice;
            return true;
        }else{
            System.err.println("enter again (practice range 0 to 10)");
            return false;
        }
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Enter student id");
        setStudentId(scanner.nextLine());
        System.out.println("Enter theory");
        while (!setTheory(Double.parseDouble(scanner.nextLine())));
        System.out.println("Enter practice");
        while (!setPractice(Double.parseDouble(scanner.nextLine())));
    }
    public double calculateFinalmark(){
        return (this.theory +this.practice)/2;
    }
    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "studentId='" + studentId + '\'' +
                ", Theory=" + theory +
                ", practice=" + practice +
                ", final mark=" + calculateFinalmark() +
                '}';
    }
}
