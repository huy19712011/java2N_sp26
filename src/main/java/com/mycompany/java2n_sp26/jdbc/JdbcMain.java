package com.mycompany.java2n_sp26.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcMain {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("java2N_sp26", "sa", "123456");

        Connection connection = null;

        try {
            connection = dcm.getConnection();
            System.out.println("Connected...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

}
