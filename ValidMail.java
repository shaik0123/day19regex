package day19regex;

import java.util.Scanner;

public class ValidMail {
    private void validEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email : ");
        String email = sc.next();
        String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        if (email.matches(pattern)) {
            System.out.println("This is Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void main(String[] args) {
        ValidMail obj = new ValidMail();
        obj.validEmail();
    }
}
