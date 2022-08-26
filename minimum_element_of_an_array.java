import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,temp;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]<min)
            {
                temp=a[i];
                min=temp;
            }
        }
        System.out.println(min);
    }
}