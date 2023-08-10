class SMax
{
    public static void main(String ram[])
    {
        int num = 523896724;
        int max=0,smax=0;
        while(num!=0)
        {
             int digit = num%10;
             System.out.println(digit);
             if(max<digit)
             {
                  smax=max;
                  max=digit;
              }
              else if(smax<digit)
              { 
                   smax=digit;   
              }
             
             num/=10;
        }
 
         System.out.println("max="+max + " second max="+smax);

    }

}