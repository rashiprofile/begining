import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int n,i,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
for(i=2;i<n;i++)
{
 if(n%i==0)
  c++;
}
if(c==0)
 System.out.println(n+" is a prime no.");
else
 System.out.println(n+" is not a prime no.");
}
}
