import java.util.Scanner;

public class L401SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Input number 2: ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("Before swap: num1 = "+num1+" num2= "+num2);
        swap(num1, num2);
        System.out.println("After swap: num1 = "+ num1+" num2= "+num2);
    }
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
