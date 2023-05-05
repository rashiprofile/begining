import java.util.*;
class si
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float p,r,t,s;
System.out.println("Enter principal amount:");
p=sc.nextFloat();
System.out.println("Enter rate of interst:");
r=sc.nextFloat();
System.out.println("Enter time period:");
t=sc.nextFloat();
s=(p*r*t)/100;
System.out.println("Simple Interest : "+s);
}
}
