public class L303Complex {

    private double realPart;
    private double imaginaryPart;

    public L303Complex() {
    }

    public L303Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginarypart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public L303Complex add(L303Complex otherNumber){
        double resultRealPart = this.realPart + otherNumber.realPart;
        double resultlmaginaryPart = this.imaginaryPart+ otherNumber.imaginaryPart;
        L303Complex resultNumber = new L303Complex(resultRealPart,resultlmaginaryPart);
        return resultNumber;
    }
    @Override
    public String toString(){
        return "Complex[realPart="+realPart+",imaginaryPart="+imaginaryPart+"]";
    }

}
