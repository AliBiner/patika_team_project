package com.psf.ui;

import com.psf.UserException;
import com.psf.domain.User;

import java.util.Locale;
import java.util.Scanner;

public class UserUI {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    public void teacherPanel(Scanner scanner) throws UserException {

        String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        String PASSWORD_REGEX = "^.{8,}$";
        System.out.println("Your name: ");
        String name = scanner.nextLine();
        System.out.println("Your lastname: ");
        String lastname = scanner.nextLine();
        System.out.println("Your username: ");
        String username = scanner.next();
        System.out.println("Your email: ");
        String email = scanner.next().trim();
        while(!email.matches(EMAIL_REGEX)){
            System.out.println(RED + "Invalid email format. Please enter a valid address." + RESET);
            System.out.println("Your email: ");
            email = scanner.next().trim();
        }
        scanner.nextLine();
        System.out.println("Your password: ");
        String password = scanner.next().trim();
        while(!password.matches(PASSWORD_REGEX)){
            System.out.println(RED + "Invalid password format. Please enter a valid password." + RESET);
            password = scanner.next().trim();
        }
        User user = new User(name,lastname,username,email,password);









    }

    public void studentPanel() {


    }
}
