package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl implements UserService {

    public void createUsersTable() {

        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {

        userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
        System.out.println("Имя User " + name + " добавлено в БД");
    }

    public void removeUserById(long id) {

        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List<User> users =  userDaoHibernate.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public void cleanUsersTable() {

        userDaoHibernate.cleanUsersTable();

    }
}
