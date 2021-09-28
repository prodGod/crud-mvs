package web.DAO;

import org.springframework.stereotype.Repository;
import web.DAO.interfaces.UserDAO;

import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public void saveUser(User user) {
        getEntityManager().persist(user);
    }

    @Override
    public void updateUser(User user) {
        getEntityManager().merge(user);
    }

    @Override
    public List<User> getUsers() {
        return getEntityManager().
                createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void deleteUser(int id) {
        getEntityManager()
                .createQuery("delete from User where id=: id")
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public User getUserById(int id) {
        return getEntityManager().find(User.class, id);
    }
}


