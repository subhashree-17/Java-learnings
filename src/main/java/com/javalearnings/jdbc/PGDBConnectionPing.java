package com.javalearnings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PGDBConnectionPing {
    private static final String username = "postgres";
    private static final String password = "1234";
    private static final String jdbcURL = "jdbc:postgresql://localhost:5432/postgres?user="+username+"&password="+password;
//    jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true

        public static void main(String[] args) {
            Connection connection = null;
            try {
                // Load the PostgreSQL JDBC driver
                Class.forName("org.postgresql.Driver");


                connection = DriverManager.getConnection(jdbcURL);

                // Test the connection
                if (connection != null) {
                    System.out.println("Connected to the database!");
                } else {
                    System.out.println("Failed to make connection!");
                }
            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (connection != null)
                        connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

