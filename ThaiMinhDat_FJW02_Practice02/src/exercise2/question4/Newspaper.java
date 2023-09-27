package exercise2.question4;

import java.util.Scanner;

public class Newspaper extends Document{
    private String dateIssue;
    public Newspaper(){}

    public Newspaper(String dateIssue) {
        super();
        this.dateIssue = dateIssue;
    }

    public String getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(String dateIssue) {
        this.dateIssue = dateIssue;
    }
    public void inputInformation(){
        super.inputInformation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dateIssue");
        setDateIssue(sc.nextLine());

    }
    @Override
    public String toString() {
        return super.toString()+"Newspaper{" +
                "dateIssue='" + dateIssue + '\'' +
                '}';
    }
}
