import java.util.Scanner;

public class FindFrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input n is the number of element of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        int count[] = new int[arr[max] + 1];
        for (int i = 0; i < arr[max] + 1; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < arr[max] + 1; i++) {
            if (count[i] > 0) {
                System.out.print(i + " - " + count[i] + "; ");
            }
        }
    }
}
