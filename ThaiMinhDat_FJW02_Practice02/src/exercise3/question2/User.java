package exercise3.question2;

import java.util.Scanner;

public abstract class User {
    private String name;
    private double salary;
    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = sc.nextLine();
        System.out.println("Enter salary");
        this.salary = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public abstract double calculatePay();
}
