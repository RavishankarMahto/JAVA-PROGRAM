import java.util.Scanner;

public class Password{
    public static void main(String[] args) {
        int pwd;
        System.out.print("Please enter the password: ");
        Scanner ravi = new Scanner(System.in);
        pwd=ravi.nextInt();

        if (pwd==8877) {
            System.out.println("I'm Ravishankar");
            System.out.println("I'm from bihar");
            System.out.println("Mobile nob is 8877522467");
            
        }
        else
        {
            System.out.println("Sorry, You entered wrong password");
        }
    }
}
