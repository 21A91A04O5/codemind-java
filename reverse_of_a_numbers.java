import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,a,rev=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        a=rev;
        System.out.println(a);
    }
}