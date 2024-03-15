import java.util.Scanner;
class Circle
{
public static void main (String args [])
{
double r,dia,peri,area ;
System.out.println("Enter the radius of circle : ");
Scanner s = new Scanner (System.in);
r = s.nextDouble();
dia = 2*r;
peri = 2*Math.PI*r;
area = Math.PI*r*r;
System.out.printf("The dia of circle is : %.2f \n", dia);
System.out.printf("The peri of circle is : %.2f \n", peri);
System.out.printf("The area of the circle is : %.2f \n", area);
}
}
