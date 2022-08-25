import java.util.Scanner;
import java.lang.Math;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t;
        double a,b;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        a=Math.pow(1+(r/100),t);
        b=a*p;
        System.out.format("%.2f",b);
    }
}