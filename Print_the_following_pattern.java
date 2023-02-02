import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=n;j>=1;j--)
            {
                if(i==j || i+j==n+1)
                   System.out.print(i+" ");
                else
                   System.out.print(" ");
            }
            System.out.println();
        }
    }
}