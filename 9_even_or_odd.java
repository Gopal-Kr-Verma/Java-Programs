import java.util.*;
class even_or_odd
{
 public static void main(String[]a)
  {
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   n=sc.nextInt();
   if(n%2==0)
    {
     System.out.println("number is even"+n);
    }
   else
    {
     System.out.println("number is odd"+n);
    }
  }
}