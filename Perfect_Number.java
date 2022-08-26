import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
                sum=sum+i;
        }
        if(sum==n)
           System.out.print("True");
        else
           System.out.print("False");
    }
}