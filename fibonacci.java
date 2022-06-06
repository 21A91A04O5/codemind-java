import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        int a,b,c,i,n;
        a=0;
        b=1;
        System.out.print(a+" "+b);
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}