
public class Main {
    public static void main(String[] args) {

        User user = new User("", "");

        try{
            user.registerUser("John Doe", "12345");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {

            user.registerUser("john_doe", "password123");
            System.out.println("Registration successful!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
