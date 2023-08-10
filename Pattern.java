class Pattern
{
   public static void main(String args[])
   {
          for(int i=5;i>=1;i--)
          {
              char ch='A';
              for(int j=1;j<=i;j++)
              {
                   if(j%2!=0)
                   System.out.print(ch);
                   else
                   {
                   System.out.print((char)(ch+32));
                   ch++;
                   }
                     
              }
              System.out.println();

          }


   }


}
