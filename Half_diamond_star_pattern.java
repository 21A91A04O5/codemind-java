import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        if(n>=3 && n<=100)
        {
            for(i=0;i<n;i++)
            {
               for(j=0;j<=i;j++)
                 System.out.print("*");
               System.out.println();   
            }
            for(i=n-2;i>=0;i--)
            {
               for(j=0;j<=i;j++)
                 System.out.print("*");
               System.out.println();   
            }
        }
        else
          System.out.println("The pattern is not possible");
    }
}