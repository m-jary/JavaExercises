package PasswordValidator;/*Create a password validator to verify the strength of a proposed password.
The user's current username is "johndoe" and their current password is ABC_1234.
You'll prompt the user to enter a new password, and then you'll verify that:
    the password is at least eight characters long
    contains an uppercase letter
    contains a special character
    does not contain the username
    is not the same as the old password.*/

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        String username = "johndoe";
        String currentPassword = "ABC_1234";
        boolean isPasswordIncorrect = true;
        Scanner scanner = new Scanner(System.in);

        while (isPasswordIncorrect) {
            System.out.println("Please provide a new password:");
            String newPassword = scanner.next();

            if (newPassword.equals(currentPassword)) {
                System.out.println("Your new password can't be the same as your old one.");
            } else if (newPassword.length() < 8 ) {
                System.out.println("Your new password must be at least 8 characters long.");
            } else if (!newPassword.matches(".*[A-Z].*")) {
                System.out.println("Your new password must contain at least one upper case letter.");
            } else if (!newPassword.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*")) {
                System.out.println("Your new password must contain at least one special character.");
            } else if (newPassword.contains(username)) {
                System.out.println("Your new password can't contain your username.");
            } else {
                isPasswordIncorrect = false;
            }

            System.out.println("Password changed.");
        }
    }
}