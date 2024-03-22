import java.util.Scanner;

public class Students_Marks{
    public static void main(String[] args) {

        int marks;
        System.out.println("Entered Students marks:");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();

        if(marks>=90 && marks<=100) {
           System.out.println("You are board topper");
           
        }
        else if(marks>=70 && marks<=89){
            System.out.println("You are district topper");

        }
        else if(marks>=60 && marks<=69){
            System.out.println("First division");

        }
        else if(marks>=30 && marks<=59){
            System.out.println("Second division");

        }
        else{
            System.out.println("You are fail");
        }

    }
}