import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sumo=0,sume=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i%2==0)
               sume=sume+a[i];
        }
        for(i=0;i<n;i++)
        {
            if(i%2!=0)
               sumo=sumo+a[i];
        }
        if(sumo>sume)
            System.out.print(sumo-sume);
        else 
            System.out.print(sume-sumo);
    }
}