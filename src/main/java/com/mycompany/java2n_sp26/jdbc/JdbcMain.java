package com.mycompany.java2n_sp26.jdbc;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.SQLException;

public class JdbcMain {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("java2N_sp26", "sa", "123456");

        try (Connection connection = dcm.getConnection()) {

            System.out.println("Connected...");

        } catch (SQLException e) {
            System.out.println("Failed to connect to database");
            e.printStackTrace();
        }
    }

}
