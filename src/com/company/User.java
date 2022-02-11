package com.company;
import java.lang.String;

public class User {
    private int id_gen = 0;
    private String firstName;
    private String secondName;
    private int age;
    private String gender;
    private int id;
    private String password;
    private String dateOfBirth;

    public User() {
        id = id_gen++;
    }

    public User(String firstName, String secondName, int age, String gender, int id, String password, String dateOfBirth){
        this();
        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);
        setGender(gender);
        setId(id);
        setPassword(password);
        setDateOfBirth(dateOfBirth);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                ", surname='" + secondName + '\'' +
                ", age:'" + age + '\'' +
                ", gender:'" + gender + '\'' +
                ", password:'" + password + '\'' +
                ", dateOfBirth:'" + dateOfBirth + '\'' +
                '}';
    }


}