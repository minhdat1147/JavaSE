package exercise2.question4;

import java.util.Scanner;

public class Document {
    private String id;
    private String publisherName;
    private String publicationsQuantity;
    public Document(){

    }

    public Document(String id, String publisherName, String publicationsQuantity) {
        this.id = id;
        this.publisherName = publisherName;
        this.publicationsQuantity = publicationsQuantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublicationsQuantity() {
        return publicationsQuantity;
    }

    public void setPublicationsQuantity(String publicationsQuantity) {
        this.publicationsQuantity = publicationsQuantity;
    }
    public void inputInformation(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id");
        setId(sc.nextLine());

        System.out.println("Enter publisherName");
        setPublisherName(sc.nextLine());
        System.out.println("Enter publicationsQuantity");
        setPublicationsQuantity(sc.nextLine());
    }
    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", publicationsQuantity='" + publicationsQuantity + '\'' +
                '}';
    }
}
