package br.com.Bayer.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    private static ConnectionManager instance;

    private ConnectionManager() {}

    public static ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public Connection getConnetion()
    {
        Connection conexao = null;

        try {
            Class.forName("oracle.br.com.Bayer.jdbc.driver.OracleDriver");

            conexao = DriverManager.getConnection("br.com.Bayer.jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                    "RM92355", "270302");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conexao;
    }
}