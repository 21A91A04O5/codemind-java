import java.util.Scanner;
class Sample
{
    static int reve(int n)
    {
        int re=0,r;
        while(n>0)
        {
            r=n%10;
            re=re*10+r;
            n=n/10;
        }
        return re;
    }
    public static void main(String args[])
    {
        int n,a,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n*n;
        b=Sample.reve(n)*Sample.reve(n);
        if(a==Sample.reve(b))
            System.out.print("True");
        else
            System.out.print("False");
    }
}
