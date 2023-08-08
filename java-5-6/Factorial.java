class Factorial
{
    public static void main(String args[])
    {
          int num=9;
          int f=1;
      //    int i=num;
          String s= "";

          for(int i=num;i>1;i--)
          {
             f=f*i;
             s = s + i + "*";
          }

        /*  while(i>1)
          {
             f=f*i;
             s = s + i + "*";
             i--;
            
          }*/

          System.out.println(s+"1"+"="+f);
    }


}