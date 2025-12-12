/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Kaizer
 */
import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection con = Conn.getConnection();
        if (con != null) {
            System.out.println("✔ SUCCESS: Connected to SQL Server!");
        } else {
            System.out.println("✘ FAILED: Connection is null.");
        }
    }
}
