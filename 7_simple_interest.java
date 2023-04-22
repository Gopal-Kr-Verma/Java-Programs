import java.util.*;
class simple_interest
{
 public static void main(String[]a)
  {
   int p,r,t;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter principle,rate and time");
   p=sc.nextInt();
   r=sc.nextInt();
   t=sc.nextInt();
   int si=p*r*t/100;
   int amt=p+si;
   System.out.println("simple interest="+si+"amount="+amt);
  }
}