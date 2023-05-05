import java.util.Scanner;
class case
{
public static void main(String args[])
{
char c;
Scanner sc=new scanner(System.in);
System.out.println("Enter a alphabet:");
 c=sc.next().charAt(0);
if(c>=97 && c<=122)
 System.out.println("It is in lowercase");
else
 System.out.println("It is in uppercase");
}
}