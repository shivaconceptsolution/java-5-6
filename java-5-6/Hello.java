class Hello
{
     
   //  public static void main(String args[])
   //  public static void main(String [] args)
        public static void main(String... args)
     {
         System.out.println("hello world");
         main();
         int x[] ={1,2};
         main(x);
         System.out.println(args[0]);
         System.out.println(args[1]);
     }
     public static void main()
     {
         System.out.println("main hello world");
     }
     public static void main(int a[])
     {
         System.out.println("main hello world2");
     }
     static
     {
         int a=10,b=20,c=30;
         c=a+b;
         System.out.println(c);
     }

}