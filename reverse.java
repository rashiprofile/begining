import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
int n,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
while(n>0)
{
 rev=rev*10+(n%10);
 n/=10;
}
System.out.println("Reverse of the number is "+rev);
}
}