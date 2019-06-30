package com.sda.db;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CatManager {

    //    private static final String INSERT_INTO_CATS_NAME_BIRTH_YEAR_COLOUR_VALUES = "INSERT INTO cats(name, birth_year, colour) VALUES (?, ?, ? )";
//
//
//    public void createCat(Connection connection) throws SQLException {
//
//        PreparedStatement statement = connection.prepareStatement(INSERT_INTO_CATS_NAME_BIRTH_YEAR_COLOUR_VALUES);
//        statement.setString(1, "Rye");
//        statement.setInt(2, 2000);
//        statement.setString(3, "Brown");
//        statement.executeUpdate();
//        statement.setString(1, "Pusia");
//        statement.setInt(2, 2006);
//        statement.setString(3, "White");
//        statement.executeUpdate();
//
//
//        //  Statement statement = connection.createStatement();
//        //  statement.executeUpdate("INSERT INTO cats(name, birth_year, colour) VALUES ('Rys', 2000, 'Brown' )");
//    }
//
//    List<Cat> findAllCats(Connection connection) throws SQLException {
//        Statement statement = connection.createStatement();
//        ResultSet result = statement.executeQuery("SELECT c.id as cat_id,c.name as cat_name,c.birth_year as cat_by, c.colour as cat_colour FROM cats c");
//
//        List<Cat> cats = new ArrayList<>();
//        while (result.next()) {
//            int catId = result.getInt("cat_id");
//            String catName = result.getString("cat_name");
//            int birthYear = result.getInt("cat_by");
//            String catColor = result.getString("cat_colour");
//            Cat cat = new Cat(catId, catName, birthYear, catColor);
//            cats.add(cat);
//        }
//        return cats;
//    }
    public void createCat(Session session, Cat cat) {

        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.save(cat);
        transaction.commit();
        session.close();
    }


}