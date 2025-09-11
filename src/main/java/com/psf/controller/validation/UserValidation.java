package com.psf.controller.validation;

import com.psf.Gender;
import com.psf.UserException;
import com.psf.dto.SigninUserDto;

import java.security.PublicKey;
import java.time.LocalDateTime;

public final class UserValidation {

    private boolean id;
    private boolean firstName;
    private boolean middleName;
    private boolean lastName;
    private boolean userName;
    private boolean email;
    private boolean password;
    private boolean createdDate;
    private boolean updatedDate;
    private boolean isActive;
    private boolean gender;

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";

    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final String PASSWORD_REGEX = "^.{8,}$";

    private static final String FIRST_NAME_NULL = "firstname null olamaz";
    private static final String FIRST_NAME_EMPTY = "firstname empty olamaz";
    private static final String LAST_NAME_NULL = "lastname null olamaz";
    private static final String LAST_NAME_EMPTY = "lastname null olamaz";
    private static final String EMAIL_NULL = "email null olamaz";
    private static final String EMAIL_EMPTY = "email empty olamaz";
    private static final String EMAIL_MATCH = "EMAİL FORMATI GEÇERSİZ";
    private static final String PASSWORD_NULL = "PASSWORD null olamaz";
    private static final String PASSWORD_EMPTY = "PASSWORD empty olamaz";
    private static final String PASSWORD_MATCH = "PASSWORD FORMATI GEÇERSİZ";





    public UserValidation firstName(String firstName){
        if(firstName == null){
            this.firstName=false;
        }
        if(firstName.trim().isEmpty()){
            this.firstName=false;
        }

        this.firstName=true;

        return this;
    }

    public UserValidation lastName(String lastName){
        if(lastName == null){
            this.lastName=false;
        }
        if(lastName.trim().isEmpty()){
            this.lastName=false;
        }
        this.lastName=true;

        return this;
    }

    public UserValidation email(String email){
        if(email == null){
            this.email=false;
        }
        if(email.trim().isEmpty()){
            this.email=false;
        }
        if(!email.matches(EMAIL_REGEX)){
            this.email=false;
        }
        this.email=true;
        return this;
    }

    public UserValidation password(String password){
        if(password == null){
            this.password=false;
        }
        if(password.trim().isEmpty()){
            this.password=false;
        }
        if(!password.matches(PASSWORD_REGEX)){
            this.password=false;
        }

        this.password=true;
        return this;
    }


}
