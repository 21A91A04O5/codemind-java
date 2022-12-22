import java.util.Scanner;
class Sample
{
    public static boolean prime(int n)
    {
        int f=0,i;
        if(n==1)
        {
            return false;
        }
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
               f=1;
        }
        if(f==0)
           return true;
        else
           return false;
    }
    public static boolean pali(int n)
    {
        int temp,rev=0,r;
        temp=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp)
           return true;
        else
           return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        i=n+1;
        while(true)
        {
            if(Sample.pali(i) && Sample.prime(i))
            {
                System.out.print(i);
                break;
            }
            i++;
        }
    }
}