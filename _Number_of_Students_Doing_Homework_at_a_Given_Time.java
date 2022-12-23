import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a[],b[],c,d=0,i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
           a[i]=sc.nextInt();
        m=sc.nextInt();
        b=new int[m];
        for(i=0;i<m;i++)
           b[i]=sc.nextInt();
        c=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<=c && c<=b[i])
                d+=1;
        }
        System.out.print(d);
    }
}