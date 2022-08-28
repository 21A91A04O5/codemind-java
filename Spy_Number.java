import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sum=0,pro=1;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        if(sum==pro)
           System.out.println("Spy Number");
        else
           System.out.println("Not Spy Number");
    }
}