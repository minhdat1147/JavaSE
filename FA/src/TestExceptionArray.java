import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while(!check){

        }
        int a[];
        try {
            System.out.println("Enter number array index");
            int n = scanner.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter element of array " + i + ": ");
                a[i] = Integer.parseInt(scanner.nextLine());
            }
            System.out.println("Enter index u need truy xuất:");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println(a[index]);
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException");
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
