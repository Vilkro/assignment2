package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<User> users = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(true){

            User user = new User();
            user.setFirstName(scan.next());
            user.setSecondName(scan.next());
            int age = scan.nextInt();
            if(!Validator.checkAge(age)){
                System.out.println("The age is less than 18, so you don't allowed");
                continue;
            }
            user.setAge(age);
            user.setGender(scan.next());
            String password = scan.next();
            if(!Validator.checkPassword(password)){
                System.out.println("The password was written wrong way, write again all data");
                continue;
            }
            user.setPassword(password);
            String dateOfBirth = scan.next();
            if(!Validator.checkDate(dateOfBirth)){
                System.out.println("The Date was written wrong way, write again all data");
                continue;
            }
            user.setDateOfBirth(dateOfBirth);
            users.add(user);

        }
    }
}

