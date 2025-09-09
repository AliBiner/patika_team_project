package com.psf;

import java.time.LocalDateTime;

public class User {

    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isActive;
    private Gender gender;

    public User(String firstName,String lastName, String userName, String email, String password) throws UserException {
        setFirstName(firstName);
        setLastName(lastName);
        setUserName(userName);
        setEmail(email);
        setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(this.id ==0){
            this.id = id;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws UserException {
        if(firstName == null){
            throw new UserException("İsim bulunamadı");
        }
        if(firstName.trim().isEmpty()){
            throw new UserException("İsim boş olamaz");
        }
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws UserException {
        if(lastName == null){
            throw new UserException("İsim bulunamadı");
        }
        if(lastName.trim().isEmpty()){
            throw new UserException("İsim boş olamaz");
        }

        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws UserException {
        if(userName == null){
            throw new UserException("Soyisim bulunamadı");
        }
        if(userName.trim().isEmpty()){
            throw new UserException("Soyisim boş olamaz");
        }
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws UserException {
        if(email == null){
            throw new UserException("Email bulunamadı");
        }
        if(email.trim().isEmpty()){
            throw new UserException("Email boş olamaz");
        }
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws UserException {
        if(password == null){
            throw new UserException("Şifre bulunamadı");
        }
        if(password.trim().isEmpty()){
            throw new UserException("Şifre boş olamaz");
        }
        this.password = password;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", isActive=" + isActive +
                ", gender=" + gender +
                '}';
    }
}
