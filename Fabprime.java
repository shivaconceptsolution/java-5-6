class Fabprime
{
   public static void main(String args[])
   {
       int a=-1,b=1,c;
       int terms=0;
       terms=1;
       while(terms<=10)
       {
            c=a+b;
            int j=2;
            while(j<c)
            {
                 if(c%j==0)
                    break;
                 j++;
            }
            if(c==j)
            System.out.println(c);
            a=b;
            b=c;
           // System.out.println(c);
            terms++;
 
       }
       

   }

}