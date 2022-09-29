import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,a[],count=0;
        n=sc.nextInt();
        k=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]%k==0)
               count++;
        }   
        System.out.print(count);
    }
}