public class L303ComplexDemo {
    public static void main(String[] args) {
        L303Complex currentNumber = new L303Complex(1000,1200);
        L303Complex otherNumber = new L303Complex(600,800);
        L303Complex resultNumber = currentNumber.add(otherNumber);
        System.out.println(resultNumber);
    }
}
