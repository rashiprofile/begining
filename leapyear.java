import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
int yr;
Scanner sc=new Scanner(System.in);;
System.out.println("Enter a year:");
yr=sc.nextInt();
if((yr%400==0)||(yr%4==0 && yr%100!=0))
 System.out.println(yr+" is a leap year.");
else
 System.out.println(yr+" is not a leap year.");
}
}