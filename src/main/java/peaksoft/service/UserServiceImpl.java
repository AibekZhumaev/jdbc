package peaksoft.service;

import org.springframework.stereotype.Component;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.util.List;

/**
 * @author Zha_Aibek@mail.com
 */

@Component
public class UserServiceImpl implements UserService {
    private UserDaoJdbcImpl userDao = new UserDaoJdbcImpl();

    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
