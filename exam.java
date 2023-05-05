import java.util.Scanner;
class exam
{
public static void main(String args[])
{
float n,a;
float per;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of classes held:");
 n=sc.nextInt();
System.out.println("Enter no. of classes attended:");
 a=sc.nextInt();
per=(a/n)*100;
if(per<75)
{
 System.out.println("Your attendence percentage is "+per);
 System.out.println("You are not allowed to sit in exam");
}
else
{
 System.out.println("Your attendence percentage is "+per);
 System.out.println("You are allowed to sit in exam");
}
}
}