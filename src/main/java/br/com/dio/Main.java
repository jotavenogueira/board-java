package br.com.dio;

import br.com.dio.persistence.migration.MigrationStrategy;


import java.sql.SQLException;

import static br.com.dio.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()) {
            System.out.println("Connected to the database!");
            new MigrationStrategy(connection).executeMigration();
        }
    }

}