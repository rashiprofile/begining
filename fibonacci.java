import java.util.*;
class fibonacci
{
public static int fib(int n,int f,int l)
{
 if (n==0)
  return f;
 else if(n==1)
  return l;
 else 
  return fib(n-1,f,l)+fib(n-2,f,l);
}
public static void main(String[] args)
{
 int n,f,l,fb;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 1st value:");
  f=sc.nextInt();
 System.out.println("Enter 2nd value:");
  l=sc.nextInt();
 System.out.println("Enter no. of terms:");
 n=sc.nextInt();
 for(int i=0;i<n;i++)
 {
  fb=fib(i,f,l);
  System.out.print(fb+" ");
 }
}
}