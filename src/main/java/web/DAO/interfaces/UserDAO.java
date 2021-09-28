package web.DAO.interfaces;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void saveUser(User user);

    void updateUser(User user);

    List<User> getUsers();

    void deleteUser(int id);

    User getUserById(int id);
}
