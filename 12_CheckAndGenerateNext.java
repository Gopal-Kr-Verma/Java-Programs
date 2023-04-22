import java.util.*;
class CheckAndGenerateNext
{
 public static void main(String[]a)
  {
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   n=sc.nextInt();
   if(n%7==0)
    {
     System.out.println("number is divisible by 7");
    }
   else
    {
     int q=n%7;
     int nxt=(++q)*7;
     System.out.println("next number is-"+nxt);
    }
  }
}