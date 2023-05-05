import java.util.Scanner;
class bonus
{
public static void main(String args[])
{
int sal,exp;
double b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your salary:");
sal=sc.nextInt();
System.out.println("Enter your year of experience:");
exp=sc.nextInt();
if(exp>5)
{
 b=sal+0.15*sal;
 System.out.println("After bonus your salary is "+b);
}
else
 System.out.println("You have no bonus!");
}
}