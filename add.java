import java.util.*;
class sum
{
public int ad(int a,int b)
{
 int c;
 c=a+b;
 return c;
}
}
class add
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
int a,b;
a=sc.nextInt();
b=sc.nextInt();
int c;
sum obj=new sum();
c=obj.ad(a,b);
System.out.println("sum of the number is "+c);
}
}

