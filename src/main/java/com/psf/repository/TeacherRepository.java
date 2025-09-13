package com.psf.repository;

import com.psf.domain.User;

import java.sql.*;
import java.time.LocalDateTime;

public class TeacherRepository {
    String url = "jdbc:postgresql://localhost:5432/team_project";
    String dbUser = "team_project";
    String dbPassword = "";

    public int save(User user) throws SQLException {
        Connection connection = DriverManager.getConnection(url,dbUser,dbPassword);
        String query = "INSERT INTO users(first_name,last_name,email,passwd,created_date) VALUES (?,?,?,?,?)";

        PreparedStatement ps = connection.prepareStatement(query);

        ps.setString(1,user.getFirstName());
        ps.setString(2,user.getLastName());
        ps.setString(3,user.getEmail());
        ps.setString(4,user.getPassword());
        ps.setTimestamp(5,Timestamp.valueOf(user.getCreatedDate()));

        return ps.executeUpdate();
    }
}
