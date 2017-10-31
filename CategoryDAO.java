package c201332028.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import c201332028.DB;

public class CategoryDAO {

    public static List<Category> findAll() throws Exception {
        String sql = "SELECT * FROM category";
        try (Connection connection = DB.getConnection("book");
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            ArrayList<Category> list = new ArrayList<Category>();
            while (resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setCategoryName(resultSet.getString("categoryName"));
                list.add(category);
            }
            return list;
        }
    }
}

