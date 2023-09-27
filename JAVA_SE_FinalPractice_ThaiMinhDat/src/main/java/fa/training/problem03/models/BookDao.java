package fa.training.problem03.models;

import fa.training.problem03.dao.Book;

import java.util.List;

public interface BookDao {
    String save(Book book);
    String update(Book book);
    List<Book> findBook();
}
