package com.jdbchandson;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.io.FileInputStream;

public class App {

    public static void main(String args[])
    {
        Connection connection = null;

        try(FileInputStream file = new FileInputStream("C:/Users/shukl/IdeaProjects/firstproject/src/main/resources/database.properties")) {

            // load the properties file
            Properties properties = new Properties();
            properties.load(file);

            // assign db parameters
            String url       = properties.getProperty("url");
            String user      = properties.getProperty("user");
            String password  = properties.getProperty("password");

            // create a connection to the database
            connection = DriverManager.getConnection(url, user, password);

            // Creating a Statement Object for querying
            Statement statement = connection.createStatement();
            String sqlquery = "select * from candidates";

            // Executing Query
            ResultSet resultSet = statement.executeQuery(sqlquery);

            // Printing the result
            while(resultSet.next())
            {
                System.out.println(resultSet.getString("first_name") + "\t" +
                        resultSet.getString("last_name")  + "\t" +
                        resultSet.getString("email"));
            }

            // Creating a preparedStatement Object for Update Query
            String sqlupdatequery = "UPDATE candidates SET last_name = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlupdatequery);

            // Replacing the two placeholder ? in preparedStatement
            preparedStatement.setString(1, "Morris");
            preparedStatement.setInt(2, 100);

            // Executing Update Query
            int rowaffected = preparedStatement.executeUpdate();
            System.out.println("Updated Row Count " + rowaffected);

            // Creating a preparedStatement Object for Insert Query
            String sqlinsertquery = "insert into candidates (first_name,last_name,dob,phone,email) values(?,?,?,?,?)";
            PreparedStatement preparedStatement1 = connection.prepareStatement(sqlinsertquery);

            // Replacing the placeholder ? in preparedStatement
            preparedStatement1.setString(1, "Abhinav");
            preparedStatement1.setString(2, "Shukla");
            preparedStatement1.setDate(3, new java.sql.Date(System.currentTimeMillis()));
            preparedStatement1.setString(4, "9506822535");
            preparedStatement1.setString(5, "shukla@gmail.com");

            // Executing Update Query
            int rowaffected1 = preparedStatement1.executeUpdate();
            System.out.println("Inserted Row Count " + rowaffected1);

            try{
                resultSet.close();
                statement.close();
                preparedStatement.close();
                preparedStatement1.close();
            }catch (SQLException e)
            {
                System.out.println("Error in closing ResultSet and Statement "+ e.toString());
            }

        } catch(IOException | SQLException e) {
            System.out.println("Error in connecting with Database "+ e.toString());
        }finally {
            try {
                if(connection != null)
                    connection.close();
            }catch (SQLException e)
            {
                System.out.println("Error in closing connection "+ e.toString());
            }
        }
        /*
        try(conn = DriverManager.getConnection(url, user, password);) {
	    // processing here
        } catch(SQLException e) {
        System.out.println("Error in connecting with Database or Closing the connection" + e.getMessage());
        }
        */
    }
}
