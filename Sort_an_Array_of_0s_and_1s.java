import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n,a[],c=0,d=0,i;
       n=sc.nextInt();
       a=new int[n];
       for(i=0;i<n;i++)
         a[i]=sc.nextInt();
       for(i=0;i<n;i++)
       {
         if(a[i]==0)
            c++;
         else
            d++;
       }
       for(i=0;i<c;i++)
         System.out.print("0 ");
       for(i=0;i<d;i++)
         System.out.print("1 ");
    }
}