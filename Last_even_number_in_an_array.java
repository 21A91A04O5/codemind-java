import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
                break;
            }
        }
    }
}