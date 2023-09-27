package exercise2.question4;

import java.util.Scanner;

public class Book extends Document{
    private String authorName;
    private int pagesQuantity;
    public Book(){
        super();
    }

    public Book(String authorName, int pagesQuantity) {
        super();
        this.authorName = authorName;
        this.pagesQuantity = pagesQuantity;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }
    public void inputInformation(){
        super.inputInformation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter authorName");
        setAuthorName(sc.nextLine());
        System.out.println("Enter pagesQuantity");
        setPagesQuantity(Integer.parseInt(sc.nextLine()));

    }
    @Override
    public String toString() {
        return super.toString()+"Book{" +
                "authorName='" + authorName + '\'' +
                ", pagesQuantity=" + pagesQuantity +
                '}';
    }
}
