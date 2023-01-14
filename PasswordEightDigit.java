package day19regex;

import java.util.Scanner;

public class PasswordEightDigit {
    private void validPasswordEightDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your PassWord ");
        String pass = sc.next();
        String pattern = "[a-zA-Z0-9]{8,}";
        if (pass.matches(pattern)) {
            System.out.println("This is Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static void main(String[] args) {
        PasswordEightDigit obj = new PasswordEightDigit();
        obj.validPasswordEightDigit();
    }
}
