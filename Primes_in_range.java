import java.util.Scanner;
class Sample
{
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
               count++;
        }
        if(count==0)
           return true;
        else
           return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int j=a;j<=b;j++)
        {
            if(Sample.isPrime(j)==true && j!=1)
               c++;
        }
        System.out.print(c);
    }
}