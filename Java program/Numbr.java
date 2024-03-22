// find positive and negative number

import java.util.Scanner;
public class Numbr {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the Numbers: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();

        if(a>=0){
            System.out.println("This is a positive number");
        }
        else{
            System.out.println("This is a negative number");
        }


    }
    
}
