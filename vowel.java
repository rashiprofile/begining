import java.util.Scanner;
class vowel
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a alphabet:");
ch=sc.next().charAt(0);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
 System.out.println("It is a vowel.");
else
 System.out.println("It is a consonant.");
}
}