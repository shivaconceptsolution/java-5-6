class Student
{
    private int rollno;
    private String name;
    void accept(int rollno,String name)
   {
      this.rollno=rollno;
      this.name=name;
   }
   void display()
   {
     System.out.println("rollno is "+rollno);
     System.out.println("name is "+name);
   }

}