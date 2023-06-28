import java.util.Scanner;

public class input {
    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
        String a= "Ajay Dangoriya";

          // Print "Write a message: "
          System.out.println("Write a message: ");

          // Read the string written by the user, and assign it
          // to program memory "String message = (string that was given as input)"
          String message = scanner.nextLine();

          // Print the message written by the user
          System.out.println(message);
          System.out.println(a);
      }
    }
}
