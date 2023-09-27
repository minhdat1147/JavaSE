package exercise3.question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    private String name;
    private String phoneNumber;
    public Phone(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        setName(scanner.nextLine());
        System.out.println("Enter phone number");
        boolean validPhoneNumber = false;
        while (validPhoneNumber == false) {

            this.phoneNumber = scanner.nextLine();
            try {
                validPhoneNumber = isPhoneNumber(this.phoneNumber);
                if (validPhoneNumber == false) {
                    System.out.println("Phone number is not valid");
                }
            } catch (Exception e) {
                validPhoneNumber = false;
            }
        }
    }
//    public void insertContact(String name, String phone){
//        for
//    }
//    public void removeContact(String name){
//        System.out.println("Enter employee name need delete");
//        String deleteName = scanner.nextLine();
//        for (int i = 0; i < employeeArrayList.size(); i++) {
//            if (employeeArrayList.get(i).getFullName().equals(deleteName)) {
//                employeeArrayList.remove(i);
//            } else {
//                System.out.println("Employee name is not valid");
//            }
//        }
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone contact = new Phone();
        ArrayList<Phone> contactArrayList = new ArrayList<>();
        System.out.println("Enter number phone number");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            contact.input();
            contactArrayList.add(contact);
        }

    }
    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("(84|0[3|5|7|8|9])+([0-9]{8})\\b");
    }
}
