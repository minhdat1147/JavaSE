import java.util.Scanner;

public class TestMaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");// số lượng phần tử trong mảng
        int n = sc.nextInt();
        int a[] = new int[n];
        MaxMinArray arr = new MaxMinArray(a);
        arr.input();
        System.out.println("max= "+arr.findMax());
        System.out.println("min="+arr.findMin());
    }
}
