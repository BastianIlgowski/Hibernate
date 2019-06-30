package com.sda.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {


        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();


        Cat c = new Cat("Mruczek", 2000, "Brown");
        Cat c2 = new Cat("Pusiek", 2001, "Black");

        CatManager catManager = new CatManager();
        catManager.createCat(sessionFactory.openSession(), c);
        catManager.createCat(sessionFactory.openSession(), c2);


    }


}
