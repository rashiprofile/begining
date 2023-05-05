import java.util.Scanner;
class sumofdigits_fun
{
public static int sum(int n)
{ 
 int s=0;
 while(n>0)
 {
 s=s+(n%10);
 n/=10;
 }
 return s;
}
public static void main(String args[])
{
 int r,n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number:");
 n=sc.nextInt();
 r=sum(n);
 System.out.println("Sum of the digits : "+r);
}
}

