package exercise2;

import java.util.Scanner;

public class Staff extends Employee{
    private  String work;
    public Staff(){
        super();
    }

    public Staff(String work) {
        super();
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
    public void inputInformation(){
        Scanner sc=  new Scanner(System.in);

        super.inputInformation();
        System.out.println("Enter work");
        setWork(sc.nextLine());
    }
    @Override
    public String toString() {
        return super.toString()+"Staff{" +
                "work='" + work + '\'' +
                '}';
    }

}
