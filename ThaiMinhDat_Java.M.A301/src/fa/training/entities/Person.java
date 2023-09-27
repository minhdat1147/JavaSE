package fa.training.entities;

import java.text.*;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import fa.training.utils.Validator;

public abstract class Person {
    private String name;
    private String gender;
    private String phoneNumber;
    private String birthDate;
    private String email;
    public Person(){}

    public Person(String name, String gender, String phoneNumber, String birthDate, String email) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        boolean valid = false;
        valid = Validator.isEmail(email);
        if(valid == true){
            this.email = email;
            return true;
        }else{
            System.out.println("Email is not valid");
            return  false;
        }


    }
    public abstract void purchasePakingPass();
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        setName(scanner.nextLine());
        System.out.println("Enter gender");
        setGender(scanner.nextLine());
        System.out.println("Enter phone number");
        boolean validPhoneNumber = false;
        while (validPhoneNumber == false) {
            this.phoneNumber = scanner.nextLine();
            try {
                validPhoneNumber = Validator.isPhoneNumber(this.phoneNumber);
                if (validPhoneNumber == false) {
                    System.out.println("Phone number is not valid");
                }
            } catch (Exception e) {
                validPhoneNumber = false;
            }
        }
        System.out.println("Enter birth date");
        boolean validBirthDate = false;
        do{
            setBirthDate(scanner.nextLine());
            try{
                validBirthDate = Validator.isBirthDate(this.birthDate);
                if(validBirthDate == false){
                    System.out.println("Birth date is not valid");
                }
            }catch (Exception e){
                validBirthDate = false;
            }
        }while (validBirthDate == false);
        System.out.println("Enter email");
        while (!setEmail(scanner.nextLine()));
    }
    public void updateStudent(List<Student> studentList , int i){
        for (int j = 0; j < studentList.size(); j++) {
            if(j == i){
                input();
                Student student = new Student();
                student.input();
            }
        }
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                '}';
    }
}
