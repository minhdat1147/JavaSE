package exercise3.question2;

public class Manager extends User{
    @Override
    public double calculatePay() {
        return super.getSalary()*520;
    }
}
