import java.util.Scanner;
class reverse_fun
{
public static int rvrse(int n)
{
 int rev=0;
 while(n>0)
 {
  rev=rev*10+(n%10);
  n/=10;
 }
 return rev;
}
public static void main(String args[])
{
 int n,r;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number:");
 n=sc.nextInt();
 r=rvrse(n);
 System.out.println("Reverse of the number is "+r);
}
}