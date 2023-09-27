import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum: "+sum(num1,num2));
        System.out.println("Subtraction: "+sub(num1,num2));
        System.out.println("Multiplication: "+mul(num1,num2));
        System.out.println("Division: "+div(num1,num2));
    }
    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static int sub(int num1, int num2){
        return num1-num2;
    }
    public static int mul(int num1, int num2){
        return num1*num2;
    }
    public static int div(int num1, int num2){
        return num1/num2;
    }

}
