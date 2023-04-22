/* write a program to accept one number from user and find their factorial. */

import java.util.*;
class Factorial
{
 public static void main(String[]a)
  {
   int i,n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   n=sc.nextInt();
   int f=1;
   i=n;
   while(i>1)
    {
     f=f*i;
     i--;
    }
   System.out.println("factorial is-"+f);
  }
}