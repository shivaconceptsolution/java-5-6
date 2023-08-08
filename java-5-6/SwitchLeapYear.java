class SwitchLeapYear
{
    public static void main(String args[])
    {
        int year=1000;
        switch(year%400)
        {
             case 0:
             System.out.println("Leap year");
             break;
             default:
             switch(year%4)
             {
                     case 0:
                      switch(year%100)
                      {
                          case 0:
                          System.out.println("not a leap year");
                          break;
                          default:
                          System.out.println("leap year");
                          break;
                      }
                     break;
                     default:
                      System.out.println("not a leap year");
                      break;

             }
             break;

        }


    }


}