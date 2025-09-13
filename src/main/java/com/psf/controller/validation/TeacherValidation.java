package com.psf.controller.validation;

import com.psf.dto.Request.SignInUserDto;

public final class TeacherValidation {


    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";

    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final String PASSWORD_REGEX ="^.{8,}$";

    private static final String FIRST_NAME_NULL = RED + "firstname null olamaz" + RESET;
    private static final String FIRST_NAME_EMPTY = RED + "firstname empty olamaz" + RESET;
    private static final String LAST_NAME_NULL = RED + "lastname null olamaz" + RESET;
    private static final String LAST_NAME_EMPTY = RED + "lastname empty olamaz" + RESET;
    private static final String EMAIL_NULL = RED + "email null olamaz"+ RESET;
    private static final String EMAIL_EMPTY = RED + "email empty olamaz"+ RESET;
    private static final String EMAIL_MATCH = RED + "EMAİL FORMATI GEÇERSİZ"+ RESET;
    private static final String PASSWORD_NULL = RED + "PASSWORD null olamaz"+ RESET;
    private static final String PASSWORD_EMPTY = RED + "PASSWORD empty olamaz"+ RESET;
    private static final String PASSWORD_MATCH = RED + "PASSWORD FORMATI GEÇERSİZ"+ RESET;


    public static boolean isValid(SignInUserDto dto){
        boolean isError = false;
        if (firstName(dto.getFirstName()) != null){
            System.out.println(firstName(dto.getFirstName()));
            isError = true;
        }
        if (lastName(dto.getLastName()) != null){
            System.out.println(lastName(dto.getLastName()));
            isError = true;
        }
        if (email(dto.getEmail()) != null){
            System.out.println(email(dto.getEmail()));
            isError = true;
        }
        if (password(dto.getPassword()) != null){
            System.out.println(password(dto.getPassword()));
            isError = true;
        }
        return isError;
    }


    private static String firstName(String firstName){
        if(firstName == null){
            return FIRST_NAME_NULL;
        }
        if(firstName.trim().isEmpty()){
            return FIRST_NAME_EMPTY;
        }
        return null;
    }

    private static String lastName(String lastName){
        if(lastName == null){
           return LAST_NAME_NULL;
        }
        if(lastName.trim().isEmpty()){
            return LAST_NAME_EMPTY;
        }
        return null;
    }

    private static String email(String email){
        if(email == null){
            return EMAIL_NULL;
        }
        if(email.trim().isEmpty()){
            return EMAIL_EMPTY;
        }
        if(!email.matches(EMAIL_REGEX)){
            return EMAIL_MATCH;
        }
        return null;
    }

    private static String password(String password){
        if(password == null){
            return PASSWORD_NULL;
        }
        if(password.trim().isEmpty()){
            return PASSWORD_EMPTY;
        }
        if(!password.matches(PASSWORD_REGEX)){
            return PASSWORD_MATCH;
        }

        return null;
    }


}
