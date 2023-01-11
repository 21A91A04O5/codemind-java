import java.util.Scanner;
class Sample
{
  public static void main(String args[])
  {
    int n,r,sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    while(n>9)
    {
        sum=0;
        while(n>0)
        {
           r=n%10;
           sum=sum+r*r;
           n=n/10;
        }
        n=sum;
    } 
    if(n==1 || n==7)
       System.out.print("True");
    else
       System.out.print("False");
  }
}