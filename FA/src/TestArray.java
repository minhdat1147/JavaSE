public class TestArray {
    public static void main(String[] args) {
        int a[] = new int[100];
        for (int i = 0; i < 5; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
