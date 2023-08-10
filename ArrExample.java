class ArrExample
{
    public static void main(String args[])
    {
        // int arr[] = {1,3,7,8,9,12,34,89,11};
         int arr[] = new int[5];
         java.util.Scanner sc = new java.util.Scanner(System.in);
         for(int i=0;i<arr.length;i++)
         {
             System.out.println("Enter element for "+i+ " index");
             arr[i]=sc.nextInt();
         }
         for(int i=0;i<arr.length;i++)
         {
              System.out.println(arr[i]);
         }

    }


}