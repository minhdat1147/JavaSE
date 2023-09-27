import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Student extends Person{
    private String rollNo;
    private float mark;
    private String email;
    public Student(){
        super();
    }

    public String getRollNo() {
        return rollNo;
    }
    //Mã sv với 8 ký tự
    public boolean setRollNo(String rollNo) {
        if(rollNo != null && rollNo.length() ==8){
            this.rollNo = rollNo;
            return true;
        }else{
            System.err.println("Enter again(rollNo is char 8)");
            return false;
        }

    }

    public float getMark() {
        return mark;
    }
    //điểm từ 0-10
    public boolean setMark(float mark) {
        if(mark >=0 && mark <=10){
            this.mark = mark;
            return true;
        }else{
            System.err.println("enter again (mark between 0 and 10)");
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains(" ")){
            this.email = email;
            return true;
        }else{
            System.err.println("Enter email(mail must have '@' character and no spaces)");
            return false;
        }

    }

    public void inputInfo(){
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rollNo");
        while(!setRollNo(scanner.nextLine()));
//        while(true){
//            String rollNoInput = scanner.nextLine();
//            boolean check = setRollNo(rollNoInput);
//            if(check){
//                break;
//            }
//        }
        System.out.println("Enter mark");
        while (!setMark(scanner.nextFloat()));
        scanner.nextLine();
        System.out.println("Enter email");
        while(!setEmail(scanner.nextLine()));

    }
    public boolean checkScholarship(){
//        if(mark >=8){
//            return true;
//        }
//        return false;
        return mark >=8;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "rollNo='" + rollNo + '\'' +
                ", mark=" + mark +
                ", email='" + email + '\'' +
                '}';
    }
}
