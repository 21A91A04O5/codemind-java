import java.util.Scanner;
class Fibonacci_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,n;
        n=sc.nextInt();
        a=0;
        b=1;
        c=0;
        while(c<n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        if(c==n)
            System.out.print("True");
        else
            System.out.print("False");
    }
}