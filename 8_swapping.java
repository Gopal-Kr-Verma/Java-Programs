import java.util.*;
class swapping
{
 public static void main(String[]a)
  {
   int b,c,d;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter two numbers");
   b=sc.nextInt();
   c=sc.nextInt();
   d=b;
   b=c;
   c=d;
   System.out.println("after swapping b="+b+"c="+c);
  }
}