import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sum;
        n=sc.nextInt();
        while(n>9)
        {
            sum=0;
            while(n>0)
            {
                r=n%10;
                sum=sum+r;
                n=n/10;
            }
            n=sum;
        }
        System.out.print(n);
    }
}