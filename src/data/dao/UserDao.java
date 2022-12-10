package data.dao;

import models.User;

import javax.sql.DataSource;
import java.util.List;

public interface UserDao {

    public void setDataSource(DataSource ds);

    public void create(User user);

    public User getUsers(Integer id);

    public List<User> listStudents();

    public void delete(Integer id);

    public void update(Integer id, Integer age);
}
