import java.util.*;
class factor
{
static int fact(int n)
{
 if(n==1 || n==0)
  return 1;
 else
  return n*fact(n-1);
}
public static void main(String[] args)
{
 int n,f;
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter a number:");
 n=sc.nextInt();
 f=fact(n);
 System.out.println("Factorial = "+f);
}
}