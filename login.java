import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean loginSuccess = false;

        while (attempts < 3 && !loginSuccess) {
            System.out.println("Enter user ID: ");
            String userId = scanner.nextLine();

            System.out.println("Enter password: ");
            String password = scanner.nextLine();

            if (userId.equals("super") && password.equals("7856")) {
                loginSuccess = true;
                System.out.println("Login successful!");
            } else {
                attempts++;
                System.out.println("Invalid user ID or password. Attempts remaining: " + (3 - attempts));
            }
        }

        if (!loginSuccess) {
            System.out.println("Login failed. Maximum attempts reached.");
        }
    }
}