package epamlab.springtask.dao;

import epamlab.springtask.model.User;

/**
 * Created by Al on 07.09.2016.
 */
public interface LoginDAO {
    public void addUser(User user);

    public void updateUser(User user);
    
    public User getUserByLogin(String login);
}
