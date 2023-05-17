import java.util.*;
import java.lang.*;
class string_func
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 String s1=new String();
 String s2=new String();
 System.out.println("Enter 1st string:");
 s1=sc.nextLine();
 System.out.println("Enter 2nd string:");
 s2=sc.nextLine();
 System.out.println("Length of 1st string is "+s1.length());
 System.out.println("Both string are eqaul: "+s1.equals(s2));
 System.out.println("Merging both strings: "+s1.concat(s2));
 System.out.println("1st string is empty: "+s1.isEmpty());
 System.out.println("After trim: "+s1.trim()+s2);
 System.out.println("Lowercase of 1st string: "+s1.toLowerCase());
 System.out.println("Uppercase of 1st string: "+s1.toUpperCase());
 
}
}
 