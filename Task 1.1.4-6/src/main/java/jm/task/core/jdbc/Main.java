package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Oleg", "Belov", (byte) 10);
        userService.saveUser("Sidor", "Sidorov", (byte) 20);
        userService.saveUser("Petr", "Petrov", (byte) 30);
        userService.saveUser("Kirill", "Kirillov", (byte) 30);


        userService.removeUserById(1);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}