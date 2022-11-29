package data.daoImpl;

import data.dao.UserDao;
import models.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

public class UserDaoImpl implements UserDao {

    DataSource dataSource;


    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
    }

    @Override
    public void create(User user) {
        String sql = "INSERT INTO User " + "(name, email, password, gender, role, dateOfBirth) VALUES (?, ?, ?, ?, ?, ?)";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getGender().name());
            ps.setString(5, user.getRole().name());
            ps.setDate(6, new Date(user.getDateOfBirth().getTime()));

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {

                }
            }
        }
    }

    @Override
    public User getUsers(Integer id) {
        return null;
    }

    @Override
    public List<User> listStudents() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id, Integer age) {

    }
}
