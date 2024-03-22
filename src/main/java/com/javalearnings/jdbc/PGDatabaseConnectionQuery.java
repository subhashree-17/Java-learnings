package com.javalearnings.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PGDatabaseConnectionQuery {
    private static final String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";

    private static final String username = "postgres";
    private static final String password = "1234";


    public static void main(String[] args){
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(jdbcURL,username,password);
             statement = connection.createStatement();
             rs = statement.executeQuery("select * from subha");

            List<SubhaEntity> subhaEntityList = new ArrayList<>();
            while(rs.next()){

                SubhaEntity subhaEntity = new SubhaEntity(
                        rs.getInt(0),
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getString(3)
                        );
                System.out.println(subhaEntity.toString());
                subhaEntityList.add(subhaEntity);
            }

            System.out.println(subhaEntityList.size());
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
