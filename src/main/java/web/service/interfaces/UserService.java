package web.service.interfaces;

import web.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void updateUser(User user);

    List<User> getUsers();

    void deleteUser(int id);

    User getUserById(int id);
}

