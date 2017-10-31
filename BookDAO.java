package c201332028.book;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import c201332028.DB;

public class BookDAO {

    public static List<Book> findAll(int currentPage, int pageSize) throws Exception {
        String sql = "SELECT b.*, c.categoryName" +
                     " FROM book b LEFT JOIN category c ON b.categoryId = c.id" +
                     " LIMIT ?, ?";
        try (Connection connection = DB.getConnection("book");
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, (currentPage - 1) * pageSize);
            statement.setInt(2, pageSize);
            try (ResultSet resultSet = statement.executeQuery()) {
                ArrayList<Book> list = new ArrayList<Book>();
                while (resultSet.next()) {
                    Book book = new Book();
                    book.setId(resultSet.getInt("id"));
                    book.setTitle(resultSet.getString("title"));
                    book.setAuthor(resultSet.getString("author"));
                    book.setCategoryId(resultSet.getInt("categoryId"));
                    book.setPrice(resultSet.getInt("price"));
                    book.setPublisher(resultSet.getString("publisher"));
                    book.setCategoryName(resultSet.getString("categoryName"));
        
                    list.add(book);
                }
                return list;
            }
        }
    }

    public static int count() throws Exception {
        String sql = "SELECT COUNT(*) FROM book";
        try (Connection connection = DB.getConnection("book");
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next())
                    return resultSet.getInt(1);
        }
        return 0;
    }

    public static Book findOne(int id) throws Exception {
        String sql = "SELECT * FROM book b LEFT JOIN category c ON b.categoryId = c.id Where b.id=?";
        try (Connection connection = DB.getConnection("book");
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                	 Book book = new Book();
                    book.setId(resultSet.getInt("id"));
                    book.setTitle(resultSet.getString("title"));
                    book.setAuthor(resultSet.getString("author"));
                    book.setCategoryId(resultSet.getInt("categoryId"));
                    book.setPrice(resultSet.getInt("price"));
                    book.setPublisher(resultSet.getString("publisher"));
                    return book;
                }
            }
            return null;
        }
    }

    
}