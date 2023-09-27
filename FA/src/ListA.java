import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListA {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số lượng phần tử mảng");
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử thứ "+i+": ");
//            integerList.add(scanner.nextInt());
//
//        }
//        for (Integer list: integerList
//             ) {
//            System.out.println(list+" ");
//        }
        ArrayList<ArrayList<Integer>> arrayList2Chieu = new ArrayList<>();
        System.out.println("Nhập cột");
        int row = scanner.nextInt();
        System.out.println("Nhập hàng");
        int colum = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> rows = new ArrayList<>();
            for (int j = 0; j < colum; j++) {
                System.out.println("Nhập phần tử mảng 2 chiều["+i+"]["+j+"]: ");
                rows.add(scanner.nextInt());
            }
            arrayList2Chieu.add(rows);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(arrayList2Chieu.get(i).get(j)+" ");
            }
            System.out.println();
        }
        // đảo đầu mảng ngang thành dọc
//        arrayList2Chieu.forEach(
//                arr -> arr.forEach(
//                        integer -> System.out.print(integer+" "))
//        System.out.println();
//                );
    }
}
