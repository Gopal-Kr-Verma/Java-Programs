import java.util.*;
class DivisibleBy5OrNot
{
 public static void main(String[]a)
  {
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   n=sc.nextInt();
   if(n%5==0)
    {
     System.out.println("number is divisible by 5");
    }
   else
    {
     System.out.println("number is not divisible by 5");
    }
  }
}