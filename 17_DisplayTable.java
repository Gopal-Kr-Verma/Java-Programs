/* write a program to accept one number from user and display their table. */

import java.util.*;
class DisplayTable
{
 public static void main(String[]a)
  {
   int n,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   n=sc.nextInt();
   i=1;
   while(i<=10)
    {
     int m=n*i;
     System.out.println(n+"*"+i+"="+m);
     i++;
    }
  }
}