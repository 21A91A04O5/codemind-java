import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k,count=0,a[];
        n=sc.nextInt();
        k=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
           a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]%k!=0)
               count++;
        }
        System.out.print(count);
    }
}