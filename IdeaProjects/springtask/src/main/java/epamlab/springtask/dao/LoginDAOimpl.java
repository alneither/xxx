package epamlab.springtask.dao;

import epamlab.springtask.model.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * Created by Al on 07.09.2016.
 */
@Repository
public class LoginDAOimpl implements LoginDAO {

    private SessionFactory factory;

    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void addUser(User user) {
        factory.getCurrentSession().persist(user);
    }

    @Override
    public void updateUser(User user) {
        factory.getCurrentSession().update(user);
    }

    @Override
    public User getUserByLogin(String login) {
        User user = (User) factory.getCurrentSession().load(User.class, login);
        return user;
    }
}
