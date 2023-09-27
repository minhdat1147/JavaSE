import java.util.Random;

public class DemoJaggedArray {
    public static void main(String[] args) {
        int[][] jagArray = new int[3][];
        jagArray[0] = new int[3];
        jagArray[1] = new int[5];
        jagArray[2] = new int[2];
        Random random = new Random(2);
        for (int i = 0; i < jagArray.length; i++) {
            for (int j = 0; j < jagArray[i].length; j++) {
                jagArray[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < jagArray.length; i++) {
            for (int j = 0; j < jagArray[i].length; j++) {
                System.out.print(jagArray[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
