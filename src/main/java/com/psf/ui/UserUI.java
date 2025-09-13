package com.psf.ui;

import java.util.Scanner;

public class UserUI {

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";

    public void teacherPanel(Scanner scanner) {
        while (true){
            System.out.println("1- Kayıt Ol");
            System.out.println("2- Giriş Yap");
            System.out.println("0- Üst Menü");
            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    TeacherUI teacherUI = new TeacherUI();
                    teacherUI.signInUI(scanner);
                    //TODO Öğretmen kayıt işlemleri
                    break;
                case "2":
                    // TODO Öğretmen giriş işlemleri
                    break;
                case "0":
                    return;
                default:
                    System.out.println(RED + "Invalid Input!" + RESET);
            }
        }
    }

    public void studentPanel() {


    }
}
