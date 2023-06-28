import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght");
        int l = sc.nextInt();
        System.out.println("Enter the breadth");
        int b = sc.nextInt();
        int area = l*b;
        System.out.println("The AREa is "+area);

    }
}
