package epamlab.springtask.service;

import epamlab.springtask.model.User;

/**
 * Created by Al on 07.09.2016.
 */
public interface LoginService {
    public void addUser(User user);

    public void updateUser(User user);

    public User getUserByLogin(String login);

}
