import java.util.Scanner;
class Sample
{
    public static int rev(int n)
    {
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n==Sample.rev(n))
           System.out.println("True");
        else
           System.out.println("False");
    }
}