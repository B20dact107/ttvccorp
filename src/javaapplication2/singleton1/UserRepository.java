/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.singleton1;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class UserRepository {
    private Connection connection;

    public UserRepository() throws SQLException {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    public void getUsers() {
        // Thực hiện các truy vấn cơ sở dữ liệu
        System.out.println("Try van duoc vao database");
        
    }
    public static void main(String[] args) throws SQLException {
        UserRepository userRepository = new UserRepository();
        userRepository.getUsers();
    }
}

