import java.util.*;
class PositiveNegativeOrZero
{
 public static void main(String[]a)
  {
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   n=sc.nextInt();
   if(n==0)
    {
     System.out.println("number is zero");
    }
   else if(n>0)
    {
     System.out.println("number is positive");
    }
   else
    {
     System.out.println("number is negative");
    }
  }
}