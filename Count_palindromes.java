import java.util.Scanner;
class Sample
{
    public static boolean palindrome(int n)
    {
        int temp=n;
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev)
          return true;
        else
          return false;
    }
    public static void main(String args[])
    {
        int a,i,x[],count=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        x=new int[a];
        for( i=0;i<a;i++)
           x[i]=sc.nextInt();
        for(i=0;i<a;i++)   
        {
            if(Sample.palindrome(x[i]))
               count++;
        }
        System.out.print(count);
    }
}