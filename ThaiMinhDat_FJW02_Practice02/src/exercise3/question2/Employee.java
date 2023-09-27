package exercise3.question2;

public class Employee extends User{
    @Override
    public double calculatePay() {
        return super.getSalary()*420;
    }
}
