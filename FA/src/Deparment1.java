public class Deparment1 extends Employees{
    private int doanhSo;
    public Deparment1(){
        super();
    }

    public Deparment1(int doanhSo) {
        super();
        this.doanhSo = doanhSo;
    }

    public int getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(int doanhSo) {
        this.doanhSo = doanhSo;
    }
    public void nhapThongTin(){
        super.inputInformation();
        System.out.println("Nhập doanh số bán hàng");
        this.doanhSo = sc.nextInt();
    }
    @Override
    public void tinhLuong(){
        if(doanhSo >=5000){
            super.luongVN = 5000*0.05;
        }
        else{
            super.luongVN = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "doanhSo=" + this.doanhSo;
    }
}
