package fa.training.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Validator {

    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("(84|0[3|5|7|8|9])+([0-9]{8})\\b");
    }
    public static boolean isEmail(String email) {
        return email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

    }
    public static boolean isBirthDate(String birthDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try{
            dateFormat.parse(birthDate);
        }catch (ParseException e){
            return false;
        }
        return true;
    }
    public boolean checkSalary(double salary){
        return salary>1000;
    }
    public boolean checkMark(double mark){
        return mark >=6;
    }
}
