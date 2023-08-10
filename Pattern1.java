class Pattern1
{
   public static void main(String args[])
   {
          for(int i=5;i>=1;i--)
          {
              int a=1,b=0;
              for(int j=1;j<=i;j++)
              {
                   if(j%2!=0)
                   {
                   System.out.print(a);
                   a=0;
                   }
                   else
                   {
                   System.out.print(b);
                   b=1;
                   
                   }
                     
              }
              System.out.println();

          }


   }


}
