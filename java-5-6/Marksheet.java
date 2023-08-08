class Marksheet
{
   public static void main(String args[])
   {
      int m1=35,m2=29,m3=37,m4=36,m5=37;
       float per;
       int c=0;
       int grace=0;
       String sub="";
      if( (m1>=0 && m1<=100) && (m2>=0 && m2<=100) && (m3>=0 && m3<=100) && (m4>=0 && m4<=100) && (m5>=0 && m5<=100))
     {
         if(m1<=33)
         {
          c++;
          grace=m1;
          sub+="Phy"+ " ";
         }
         if(m2<33)
         {
          c++;
          grace=m2;
          sub+="Chem"+ " ";
         }
         if(m3<33)
         {
          c++;
          grace=m3;
          sub+="Maths"+ " ";
         }
         if(m4<33)
         {
          c++;
          grace=m4;
          sub+="Eng"+ " ";
         }
         if(m5<33)
         {
          c++;
          grace=m5;
          sub+="Hin"+ " ";
         }
         
         if(c==0  || (c==1 && grace>=28))
         {
              per = (m1+m2+m3+m4+m5)/5;
              if(per>=33 && per<45)
                   System.out.println("pass with third division");
              else if(per<60)
                  System.out.println("pass with second division");
              else
                 System.out.println("pass with first division");
              if(grace>0)
              System.out.println("pass by grace and grace subject name is "+sub);
 
         }
         else if(c==1)
         {
              System.out.println("suppl , subject name is "+sub);
         }
         else
          {
              System.out.println("fail, subject name are "+sub);    
          }

     }
     else
     {

          System.out.println("All subject marks should be 0 to 100");
     }
      

   }

}