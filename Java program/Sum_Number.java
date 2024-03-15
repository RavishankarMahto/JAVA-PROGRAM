import java.util.Scanner;

public class Sum_Number {
    
    public static void main(String[] args) {
        
        double a,b,c;
        System.out.print("Enter the Numbers:-");

        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = a+b;

        System.out.println("Sum of two numbers"+c);
    
    }

}
