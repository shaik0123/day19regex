package day19regex;

import java.util.Scanner;
public class FirstName {
    private void validFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");

        String firstName = sc.next();
        String pattern = "^[A-Z][a-z]{2}[a-z]+";
        if (firstName.matches(pattern)) {
            System.out.println("This is Valid First Name");
        } else {
            System.out.println("invalid First Name");
        }
    }

    public static void main(String[] args) {
        FirstName obj = new FirstName();
        obj.validFirstName();
    }
}