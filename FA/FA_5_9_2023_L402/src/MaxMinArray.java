import java.util.Scanner;

public class MaxMinArray {
    private int[] intArray;

    public MaxMinArray(int[] intArray) {
        this.intArray = intArray;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Enter array ["+i+"] = ");
            intArray[i] = sc.nextInt();
        }


    }
    public int findMax(){
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if(max<intArray[i]){
                max = intArray[i];
            }
        }
        return max;
    }
    public int findMin(){
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if(min>intArray[i]){
                min = intArray[i];
            }
        }
        return min;
    }

}
