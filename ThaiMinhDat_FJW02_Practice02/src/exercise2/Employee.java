package exercise2;

import java.util.Scanner;

public class Employee {
    private String fullName;
    private int age;
    private String gender;
    private String address;
    public  Employee(){

    }

    public Employee(String fullName, int age, String gender, String address) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public boolean setGender(String gender) {
        if(gender.equals("male") ||gender.equals("female") || gender.equals("other")){
            this.gender = gender;
            return  true;
        }else{
            System.out.println("Enter again(male or famale or other)");
            return false;
        }

    }

    public String getAddress() {
        return address;
    }
    public void inputInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name");
        setFullName(scanner.nextLine());
        System.out.println("Enter age");
        setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter gender");
        while (!setGender(scanner.nextLine()));
        System.out.println("Enter address");
        setAddress(scanner.nextLine());
    }
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
