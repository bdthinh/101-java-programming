package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    static final String USERNAME = "root";
    static final String PASSWORD = "";

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String options =
            "useSSL=false" +
            "&useUnicode=true" +
            "&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false" +
            "&serverTimezone=UTC";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/NhanvienDB?" + options;

    public static void main(String[] args) {
	// write your code here
        try {
            System.out.println("Connecting to DB...");
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected");
            Statement statement = connection.createStatement();
            String sql = " SELECT * FROM NHANVIEN";
            System.out.println("Executing...");
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("Result:");
            while(rs.next()) {
                int maNV = rs.getInt("maNV");
                String hoTen = rs.getString("hoTen");
                String outputString = String.format("MaNV %d: %s", maNV, hoTen);
                System.out.println(outputString);
            }
            rs.close();
            statement.close();
            System.out.println("Closing to DB...");
            connection.close();
            System.out.println("Closed");
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
