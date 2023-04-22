import java.util.*;
class GreatestNumber
{
 public static void main(String[]a)
  {
   int b,c,d;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter three numbers");
   b=sc.nextInt();
   c=sc.nextInt();
   d=sc.nextInt();
   if(b>c)
    {
     if(b>d)
      {
       System.out.println("greatest number is-"+b);
      }
     else
      {
       System.out.println("greatest number is-"+d);
      }
    }
   else
    {
     System.out.println("greatest number is-"+c);
    }
  }
}