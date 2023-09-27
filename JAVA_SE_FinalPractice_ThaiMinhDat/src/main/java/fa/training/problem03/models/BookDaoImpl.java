package fa.training.problem03.models;

import fa.training.problem03.dao.Book;
import fa.training.problem03.utils.JDBC_Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookDaoImpl implements BookDao{

    @Override
    public String save(Book book) {
        try {
            Connection conn = JDBC_Connection.getConnection();
            String sql = "insert into books(id, title, author, price, quantity) values(?,?,?,?,?);";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, book.getId());
            stm.setString(2, book.getTitle());
            stm.setString(3, book.getAuthor());
            stm.setFloat(4, book.getPrice());
            stm.setInt(5, book.getQuantity());
            int result = stm.executeUpdate();
            if (result > 0) {
                return "success";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "fail";
    }

    @Override
    public String update(Book book) {
        try {
            Connection conn = JDBC_Connection.getConnection();
            String sql = "update ebookshop.books\n" +
                    "set price = ? and quantity = ?\n" +
                    "where id = ?;";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setFloat(1, book.getPrice());
            stm.setInt(2, book.getQuantity());
            stm.setInt(3,book.getId());
            int result = stm.executeUpdate();
            if (result > 0) {
                return "success";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "fail";
    }

    @Override
    public List<Book> findBook() {

        List<Book> productList = new ArrayList<>();
        try{
            Connection conn = JDBC_Connection.getConnection();
            String sql = "select *\n" +
                    "from ebookshop.books as b\n" +
                    "where b. title like ?\n" +
                    "Order by b.price DESC;\n";
            PreparedStatement preStatement = conn.prepareStatement(sql);
            preStatement.setString(1,  "Java%");
            System.out.println(preStatement);
            ResultSet resultSet = preStatement.executeQuery();
            while (resultSet.next()){
                Book product = new Book(resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("author"),
                        resultSet.getFloat("price"),
                        resultSet.getInt("quantity"));
                productList.add(product);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return productList;
    }
}
