import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0,avg=0,flag=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
            avg=sum/n;
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==avg)
               flag=1;
        }
        if(flag==1)
            System.out.print("True");
        else
            System.out.print("False");
    }
}