import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,s,r,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=n*n;
        while(s>0)
        {
            r=s%10;
            sum=sum+r;
            s=s/10;
        }
        if(n==sum)
           System.out.println("Neon Number");
        else
           System.out.println("Not Neon Number");
    }
}