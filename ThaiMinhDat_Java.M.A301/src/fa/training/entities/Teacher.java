package fa.training.entities;

import java.util.Scanner;

public class Teacher extends Person{
    private double basicSalary;
    private double subsidy;
    public Teacher(){
        super();
    }

    @Override
    public void purchasePakingPass() {

    }

    public Teacher(double basicSalary, double subsidy) {
        super();
        this.basicSalary = basicSalary;
        this.subsidy = subsidy;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Enter basic salary");
        setBasicSalary(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter subsidy");
        setSubsidy(Double.parseDouble(scanner.nextLine()));
    }
    public double caculateSalary(){
        return basicSalary+subsidy;
    }

    @Override
    public String toString() {
        return super.toString()+" Teacher{" +
                "basicSalary=" + basicSalary +
                ", subsidy=" + subsidy +
                ", total salary=" + caculateSalary() +
                '}';
    }
}
