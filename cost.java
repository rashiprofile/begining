import java.util.Scanner;
class cost
{
public static void main(String args[])
{
int n;
double c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of quantity:");
n=sc.nextInt();
c=n*100;
if(n>10)
{
 c=c-(0.1*c);
 System.out.println("Total cost : "+c);
}
else
 System.out.println("Total cost : "+c);
}
}