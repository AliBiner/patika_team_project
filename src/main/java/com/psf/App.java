package com.psf;

import com.sun.source.doctree.EscapeTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws UserException {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:postgresql://localhost:5432/team_project";
        String dbUser = "team_project";
        String dbPassword = "Efe.1603";
        try {
            Connection connection = DriverManager.getConnection(url,dbUser,dbPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try{
            System.out.println("İsminizi girin: ");
            String firstName= sc.nextLine();
            System.out.println("Soyisminizi girin: ");
            String lastName= sc.nextLine();
            System.out.println("Kullanıcı adınızı girin: ");
            String userName= sc.nextLine();
            System.out.println("Email girin: ");
            String email= sc.nextLine();
            System.out.println("Şifre girin: ");
            String password= sc.nextLine();
            User user = new User(firstName,lastName,userName,email,password);
            System.out.println(user);

//            String url = "jdbc:postgresql://localhost:5432/team_project";
//            String dbUser = "team_project";
//            String dbPassword = "Efe.1603";
            Connection connection = DriverManager.getConnection(url,dbUser,dbPassword);
            String sql = """
                    INSERT INTO users(first_name,last_name,username,email,passwd)
                    VALUES(?,?,?,?,?)
                    """;

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,user.getFirstName());
            ps.setString(2,user.getLastName());
            ps.setString(3, user.getUserName());
            ps.setString(4, user.getEmail());
            ps.setString(5,user.getPassword());

            System.out.println("ps.getMetaData() = " + ps.getMetaData());
            System.out.println("ps.getParameterMetaData() = " + ps.getParameterMetaData());

            int i = ps.executeUpdate();
            if(i == 0){
                System.out.println("Kayıt işlemi başarısız");
            }else {
                System.out.println("Kayıt başarılı" + i);
            }

            connection.close();


        }catch (UserException e){
            System.out.println("Hata " +e.getMessage());
        }catch (Exception e){
            System.out.println("Beklenemedik bir hata" + e.getMessage());
        }


        System.out.println("Bitt!!");




    }

    public void createTables(){

        String users = """
                CREATE TABLE users (
                	id serial PRIMARY KEY,
                	first_name VARCHAR(50) NOT NULL,
                	middle_name VARCHAR(50),
                	last_name VARCHAR(50) NOT NULL,
                	username VARCHAR(50) UNIQUE NOT NULL,
                	email VARCHAR(50) UNIQUE NOT NULL,
                	passwd VARCHAR(50) NOT NULL,
                	created_date TIMESTAMP CHECK (created_date IS NULL or created_date = created_date) NOT NULL,
                	update_date TIMESTAMP,
                	is_active BOOLEAN DEFAULT true,
                	gender VARCHAR(10)
                )
                
                """;
    }
}
