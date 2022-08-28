import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,max,r,c=0,i=0,a[];
        n=sc.nextInt();
        a=new int[20];
        while(n>0)
        {
            r=n%10;
            a[i]=r;
            n=n/10;
            i++;
            c++;
        }
        max=a[0];
        for(i=1;i<c;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print(max);
    }
}