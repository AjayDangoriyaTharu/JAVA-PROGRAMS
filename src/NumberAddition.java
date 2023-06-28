import java.util.Scanner;
public class NumberAddition{
   public static void main(String[] args){
      int input_1, input_2, my_sum;
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.println("Enter the first number: ");
      input_1 = my_scanner.nextInt();
      System.out.println("Enter the second number: ");
      input_2 = my_scanner.nextInt();
      my_scanner.close();
      System.out.println("The scanner object has been closed");
      my_sum = input_1 + input_2;
      System.out.println("Sum of the two numbers is: ");
      System.out.println(my_sum);
   }
}