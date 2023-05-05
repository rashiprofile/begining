import java.util.Scanner;
class grade
{
public static void main(String args[])
{
int marks;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks:");
marks=sc.nextInt();
if(marks>90)
 System.out.println("Grade 'A'");
else if(marks>75)
 System.out.println("Grade 'B'");
else if(marks>60)
 System.out.println("Grade 'C'");
else if(marks>45)
 System.out.println("Grade 'D'");
else if(marks>30)
 System.out.println("Grade 'E'");
else
 System.out.println("Fail!");
}
}