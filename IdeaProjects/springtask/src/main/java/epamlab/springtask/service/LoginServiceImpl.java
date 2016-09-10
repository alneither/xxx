package epamlab.springtask.service;

import epamlab.springtask.dao.LoginDAO;
import epamlab.springtask.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Al on 07.09.2016.
 */
@Service
public class LoginServiceImpl implements LoginService {
    private LoginDAO loginDAO;

    public void setLoginDAO(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.loginDAO.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        this.loginDAO.updateUser(user);
    }

    @Override
    @Transactional
    public User getUserByLogin(String login) {
        return this.loginDAO.getUserByLogin(login);
    }
}

