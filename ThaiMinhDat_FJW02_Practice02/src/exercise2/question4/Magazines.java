package exercise2.question4;


import java.util.Scanner;

public class Magazines extends Document{
    private int issueNumber;
    private int issueMonth;
    public Magazines(){
        super();
    }

    public Magazines(int issueNumber, int issueMonth) {
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(int issueMonth) {
        this.issueMonth = issueMonth;
    }
    public void inputInformation(){
        super.inputInformation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter issueNumber");
        setIssueNumber(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter issueMonth");
        setIssueMonth(Integer.parseInt(sc.nextLine()));

    }
    @Override
    public String toString() {
        return super.toString()+"Magazines{" +
                "issueNumber=" + issueNumber +
                ", issueMonth=" + issueMonth +
                '}';
    }
}
