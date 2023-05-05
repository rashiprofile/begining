import java.util.*;
class recursion
{
public static int sum(int n)
{
 if(n==1)
  return 1;
 else
  return n+sum(n-1);
}
public static void main(String[] args)
{
 int n,s;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number:");
 n=sc.nextInt();
 s=sum(n);
 System.out.println("Sum = "+s);
}
}