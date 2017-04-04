package com.company;

import java.sql.*;

public class Main {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String options =
            "useSSL=false" +
            "&useUnicode=true" +
            "&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false" +
            "&serverTimezone=UTC";

    static final String DB_URL = "jdbc:mysql://localhost/NhanvienDB?" + options;

    static final String USER = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        System.out.println("Connecting to database ...");
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            String sql = "SELECT * from PhongBan";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {
                int maphong = rs.getInt("maph");
                System.out.println("MaPhong: " + maphong);
            }
            rs.close();
            statement.close();
            System.out.println("Close connection to database ...");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
