import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int indexStart = 0;
//        int indexEnd = n-1;
//        while (indexStart < indexEnd)
//        {
//            int temp = arr[indexStart];
//            arr[indexStart] = arr[indexEnd];
//            arr[indexEnd] = temp;
//            indexStart++;
//            indexEnd--;
//        }
            int mid = n/2;
            int temp[] = new int[mid];
            for (int i = 0; i < mid; i++) {
                temp[i] = arr[i];
            }

            for (int i = mid; i < n; i++) {
                arr[i - mid] = arr[i];
            }

            for (int i = 0; i < mid; i++) {
                arr[i + n - mid] = temp[i];
            }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
