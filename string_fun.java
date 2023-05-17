import java.util.*;
import java.lang.*;
class logic
{
 public void func(String str)
 {
 System.out.println("The string is : "+str);
 }
}
class string_fun
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 String str=new String();
 System.out.println("Enter a string:");
 str=sc.nextLine();
 logic obj=new logic();
 obj.func(str);
}
}
 