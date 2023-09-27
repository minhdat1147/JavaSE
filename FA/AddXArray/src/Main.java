import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[100];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x;
        do{
            System.out.println("Input x: ");
            x= sc.nextInt();
        }while(x <=0 || x >=100);
        System.out.println(x);
        n +=1;
        arr[n-1] = x;// chèn X vào vị trí cuối mảng

//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] >= arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
        sortArray(n,arr);//
        System.out.print("Array after add X: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortArray(int n,int [] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] >= arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


}