package exercise2.question4;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Document> documentArrayList = new ArrayList<>();
        while (true) {
            showMenu();
            System.out.println("Choose 1 option");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Enter type to select (1: book 2: magazine 3: newspaper)");
                    int choiceEmployee =Integer.parseInt(scanner.nextLine());
                    switch (choiceEmployee) {
                        case 1:
                            Document bookDoccument = new Book();
                            bookDoccument.inputInformation();
                            documentArrayList.add(bookDoccument);
                            break;
                        case 2:
                            Document magazineDocument = new Magazines();
                            magazineDocument.inputInformation();
                            documentArrayList.add(magazineDocument);
                            break;
                        case 3:
                            Document newspaperDocument = new Newspaper();
                            newspaperDocument.inputInformation();
                            documentArrayList.add(newspaperDocument);
                            break;
                        default:
                            System.out.println("choose is not valid");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter document id need delete");
                    String deleteId = scanner.nextLine();
                    for (int i = 0; i < documentArrayList.size(); i++) {
                        if (documentArrayList.get(i).getId().equals(deleteId)) {
                            documentArrayList.remove(i);
                        } else {
                            System.out.println("Employee name is not valid");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < documentArrayList.size(); i++) {
                        System.out.println(documentArrayList.get(i).toString());
                    }
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Exit!!");
                    System.exit(choose);
                    break;
                default:
                    System.out.println("choose is not valid");
                    break;
            }
        }
    }
    public static void showMenu() {
        System.out.println("1. Add new document");
        System.out.println("2. Delete by document id");
        System.out.println("3. Display information");
        System.out.println("4. Search document by type");
        System.out.println("5. exit program");
    }
}
