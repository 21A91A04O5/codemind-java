import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       long a;
       a=sc.nextLong();
       if(a>0)
       {
         long c=(long)a/10;
         System.out.println(c);
       }
       else if(a<0)
       {
         if(a%10==0)
         {
            System.out.println((long)a/10);
         }
         else if(a%10!=0)
         {
            long c=(long)(a/10)-1;
            System.out.println(c);
         }
       }  
       else
         System.out.print("0");
    }
}