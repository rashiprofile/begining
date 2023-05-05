import java.util.Scanner;
class evenodd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter a positive integer: ");
a=sc.nextInt();
if(a%2==0)
 System.out.println("Even no.");
else
 System.out.println("Odd no.");
}
}