import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        Scanner data =  new Scanner(System.in);
        System.out.println("Enter the principle :");
        float p = data.nextFloat();
        System.out.println("Enter the time :");
        int t = data.nextInt();
        System.out.println("Enter the Rate :");
        float r = data.nextFloat();
        float ci = (p*t*r)/100;
        System.out.println("The Simple Interest is : "+ci);

    
    }
}
