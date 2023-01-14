package day19regex;

import java.util.Scanner;

public class LastName {
    public void validLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last Name : ");
        String lastName = sc.next();
        String pattern = "^[A-Z]{1}[a-z]{2,}";
        if(lastName.matches(pattern)){
            System.out.println("This is Valid Last Name");
        }
        else{
            System.out.println("invalid last Name");
        }
    }
    public static void main(String[] args) {
        LastName obj = new LastName();
        obj.validLastName();
    }
}