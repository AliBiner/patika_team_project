package com.psf.ui;

import com.psf.controller.TeacherController;
import com.psf.dto.ResponseDto;
import com.psf.dto.Request.SignInUserDto;

import java.util.Scanner;

public class TeacherUI {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";

    public void signInUI(Scanner scanner){
        while (true){
            String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
            String PASSWORD_REGEX = "^.{8,}$";
            System.out.println("Your name: ");
            String name = scanner.nextLine();
            System.out.println("Your lastname: ");
            String lastname = scanner.nextLine();
            System.out.println("Your email: ");
            String email = scanner.nextLine().trim();
            while(!email.matches(EMAIL_REGEX)){
                System.out.println(RED + "Invalid email format. Please enter a valid address." + RESET);
                System.out.println("Your email: ");
                email = scanner.next().trim();
            }
//            scanner.nextLine();
            System.out.println("Your password: ");
            String password = scanner.next().trim();
            while(!password.matches(PASSWORD_REGEX)){
                System.out.println(RED + "Invalid password format. Please enter a valid password. M" + RESET);
                password = scanner.next().trim();
            }
            SignInUserDto dto = new SignInUserDto();
            dto.setFirstName(name);
            dto.setLastName(lastname);
            dto.setEmail(email);
            dto.setPassword(password);

            TeacherController teacherController = new TeacherController();
            ResponseDto result = teacherController.signIn(dto);
            if (result!=null){
                TeacherUI teacherUI = new TeacherUI();
                teacherUI.teacherUI();
            }
            scanner.nextLine();
        }
    }

    public void teacherUI(){
        while (true){
            System.out.println("1 - Quiz Oluştur");
            System.out.println("2 - Öğrenci Görüntüle");
            System.out.println("0 - Üst Menü");
        }
    }
}
