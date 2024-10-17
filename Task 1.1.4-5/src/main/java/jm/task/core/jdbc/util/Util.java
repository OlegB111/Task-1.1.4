package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Util {

    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/oleg1";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Freeway123";
    private static SessionFactory sf = null;

    public static SessionFactory getSessionFactory() {
        if (sf == null) {
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(User.class);
            cfg.setProperty("connection.driver_class", DB_DRIVER);
            cfg.setProperty("hibernate.connection.url", DB_URL);
            cfg.setProperty("hibernate.connection.username", DB_USERNAME);
            cfg.setProperty("hibernate.connection.password", DB_PASSWORD);
            // cfg.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
            // cfg.setProperty("hibernate.hbm2ddl.auto", "update");
            StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties());
            return sf = cfg.buildSessionFactory(ssrb.build());
        }
        return sf;
    }
}