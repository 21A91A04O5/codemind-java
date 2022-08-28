import java.util.Scanner;
class Sample
{
    public static void main(String pava[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        while(n%2==0)
           n=n/2;
        while(n%3==0)
           n=n/3;
        while(n%5==0)
           n=n/5;
        if(n==1)
          System.out.print("Ugly Number");
        else
          System.out.print("Not Ugly Number");
    }
}