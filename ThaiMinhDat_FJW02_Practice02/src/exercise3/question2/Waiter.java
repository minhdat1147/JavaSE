package exercise3.question2;

public class Waiter extends User{
    @Override
    public double calculatePay() {
        return super.getSalary()*220;
    }
}
