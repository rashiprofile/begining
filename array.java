import java.util.*;
class array
{
 public static void main(String[] args)
 { 
 int i;
 int []arr=new int[10];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 10 elements:");
 for(i=0;i<10;i++)
  arr[i]=sc.nextInt();
 System.out.println("The elements are:");
  System.out.println(Arrays.toString(arr));
 }
}