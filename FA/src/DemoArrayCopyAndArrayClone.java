public class DemoArrayCopyAndArrayClone {
    public static void main(String[] args) {
        // Exam Array copy
        char[] copyFrom = {'F','P','T','S','O','f','t','w','a','r','e','A','c','a','d','e','m','y'};
        char[] copyTo  = new  char[10];
        System.arraycopy(copyFrom, 3,copyTo,0,8);
        System.out.println(String.valueOf(copyTo));

        //Exam array clone
        int arr[] = { 12, 5, 18, 8, 6 };
        System.out.println("Printing original array:");
        for (int value : arr)
            System.out.print(value+" ");
        System.out.println("Printing clone of the array:");
        int carr[] = arr.clone();
        for (int value : carr)
            System.out.print(value+" ");
        System.out.println("Are both equal?");
        System.out.println(arr == carr);
    }
}
