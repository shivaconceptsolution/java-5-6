class UnboxingExample
{
public static void main(String args[])
{
      Object o=12;   //type object
      Object o1=12.34F;  //type object
      Object o2 = true;  // type object
      Object o3 = "hello"; // type object
      System.out.println(o + "," + o1 + "," + o2 + ","+ o3);

     /* int a =(int)o;
      float b = (float)o1;
      boolean bl = (boolean)o2; 
      String s = (String)o3; */
      int a=Integer.parseInt(o.toString());
      float b = Float.parseFloat(o1.toString());
      boolean bl = Boolean.parseBoolean(o2.toString());
      String s = o3.toString();
      System.out.println(a + "," +b + " "+bl + " "+s);

  
    
}

}
