import java.util.Scanner;
class swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,x;
System.out.println("Enter value of a:");
a=sc.nextInt();
System.out.println("Enter value of b:");
b=sc.nextInt();
x=a;
a=b;
b=x;
System.out.println("After swaping a & b :"+a+" "+b);
}
} 