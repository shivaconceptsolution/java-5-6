class BreakExample
{
   public static void main(String args[])
   {
       for(int i=1;i<=10;i++)
       {
                 if(i==3)
                    break;
                if(i==3 || (i==7) || i==5 )
                    continue;
               
                System.out.println(i);
                System.out.println("hello");
 
       }


   }


}