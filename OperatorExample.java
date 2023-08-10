import java.util.Scanner;
class OperatorExample
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int a,b,c;
     // System.out.println("Enter First Number");
      //a=sc.nextInt();
       a = Integer.parseInt(args[0]);
     // System.out.println("Enter Second Number");
     // b=sc.nextInt();
       b = Integer.parseInt(args[1]);
    //  System.out.println("Enter Third Number");
      //c=sc.nextInt();
       c = Integer.parseInt(args[2]);
      String s = (a>b && a>c)? " a is greatest":(b>c?"b is greatest":"c is greatest");
 
      System.out.println(s);

   }


}