package com.psf.ui;

import java.util.Scanner;

public class RooterUI {

    public void  start(){
        Scanner s =new Scanner(System.in);
        while(true){
            UserUI userUI = new UserUI();
            showMenu();
            String choice = s.next();
            s.nextLine(); // clear scanner
            switch (choice){
                case "1":
                    userUI.teacherPanel(s);
                    break;
                case "2":
                    userUI.studentPanel();
                    break;
                case "0":
                    return;

                default:
                    System.out.println("Invalid Enter");
                    break;
            }
        }
    }

    private void showMenu(){
        System.out.println("Please Choose:");
        System.out.println("1-Teacher Panel");
        System.out.println("2-Student Panel");
        System.out.println("0-Exit");
        System.out.print("Your Choice:");

    }
}
