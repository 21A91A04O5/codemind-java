//using euclidian algorithm
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,temp,r;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        {
            temp=a;
            a=b;
            b=temp;
        }
         while(b!=0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        System.out.print(a);
    }
}