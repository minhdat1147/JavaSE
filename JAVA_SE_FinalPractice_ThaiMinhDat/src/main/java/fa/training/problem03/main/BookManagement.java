package fa.training.problem03.main;

import fa.training.problem03.dao.Book;
import fa.training.problem03.models.BookDao;
import fa.training.problem03.models.BookDaoImpl;
import fa.training.problem03.utils.JDBC_Connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    static String paddingRight(String str, int widthFix){
        return String.format("%-" + widthFix + "s",str );
    }
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        List<Book> list = new ArrayList<>();
        try (Connection con = JDBC_Connection.getConnection()) {
            Scanner sc = new Scanner(System.in);
            showMenu();
            while (true) {
                System.out.print("Your choice: ");
                int choice = Integer.parseInt(String.valueOf(sc.nextInt()));
                switch (choice) {
                    case 1:

                        sc =new Scanner(System.in);
                        Book book = new Book();
                        System.out.println("Enter book id: ");
                        book.setId(Integer.parseInt(sc.nextLine()));
                        System.out.println("Enter book title");
                        book.setTitle(sc.nextLine());
                        System.out.println("Enter book author");
                        book.setAuthor(sc.nextLine());
                        System.out.println("Enter book price");
                        book.setPrice(Float.parseFloat(sc.nextLine()));
                        System.out.println("Enter book Quantity");
                        book.setQuantity(Integer.parseInt(sc.nextLine()));
                        bookDao.save(book);
                        break;
                    case 2:
                        sc = new Scanner(System.in);
                        System.out.println("Enter book id need update ");
                        int  updateBookId = sc.nextInt();
                        System.out.println("Enter book price need update");
                        float updateBookPrice = sc.nextFloat();
                        System.out.println("Enter quantity book need update: ");
                        int updateBookQuantity = sc.nextInt();
                        Book updateBook = new Book(updateBookId, updateBookPrice, updateBookQuantity);
                        bookDao.update(updateBook);
                        break;
                    case 3:
                        list = bookDao.findBook();
                        System.out.println(paddingRight("id",5) +
                                paddingRight("title",50) +
                                paddingRight("author",30) +
                                paddingRight("price",10)+
                                paddingRight("quantity",10));
                        for (Book b : list) {
                            System.out.println(paddingRight(String.valueOf(b.getId()),5) +
                                    paddingRight(b.getTitle(),50) +
                                    paddingRight(b.getAuthor(),30) +
                                    paddingRight(String.valueOf(b.getPrice()),10)+
                                    paddingRight(String.valueOf(b.getQuantity()),10));
                        }
                        break;
                    case 4:
                        System.out.println("Exit!!");
                        System.exit(choice);
                        break;
                    default:
                        break;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showMenu(){
        System.out.println("=====Menu=====");
        System.out.println("1. save book.");
        System.out.println("2. update price and quantity of book.");
        System.out.println("3. List find book.");
        System.out.println("4. Exit!!.");
    }
}