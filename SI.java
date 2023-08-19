class SI
{
    private double principal;
    private double rate;
    private double time;
    private double result;
    void accept(double principal,double rate,double time)
    {
           this.principal=principal;
           this.rate=rate;
           this.time=time;
   }
   void siCalc()
   {
       result = (this.principal*this.rate*this.time)/100;
   }
   void display()
   {
      System.out.println("Result is "+result);
   }

}

