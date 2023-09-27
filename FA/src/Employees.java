import java.util.Scanner;

public class Employees {
    private String name;
    private int deparment;
    protected double luongVN;
    Scanner sc = new Scanner(System.in);
    public Employees(){
        super();
    }

    public Employees(String name, int deparment, double luongVN) {
        super();
        this.name = name;
        this.deparment = deparment;
        this.luongVN = luongVN;
    }

    public double getLuongVN() {
        return luongVN;
    }

    public void setLuongVN(double luongVN) {
        this.luongVN = luongVN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeparment() {
        return deparment;
    }

    public void setDeparment(int deparment) {
        this.deparment = deparment;
    }
    public void inputInformation(){
        System.out.println("Nhập tên nhân viên:");
        this.name = sc.nextLine();
        System.out.println("Nhập loại phòng:chỉ nhập số{1,2,3}");
        this.deparment = sc.nextInt();
    }
    public void tinhLuong(){
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", deparment=" + deparment +
                ", luongVN=" + luongVN +
                '}';
    }
}
