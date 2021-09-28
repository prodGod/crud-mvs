package web.service;

import org.springframework.stereotype.Service;
import web.DAO.interfaces.UserDAO;

import web.model.User;
import web.service.interfaces.UserService;


import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UserServiceImp implements UserService {


    private final UserDAO userDAO;

    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }
}
