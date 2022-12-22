import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,sum=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
           a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.print(sum);
    }
}