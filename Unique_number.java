import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,i=0,a[],c=0,flag=0,j;
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
        for(i=0;i<c;i++)
        {
            for(j=0;j<c;j++)
            {
                if(i!=j)
                {
                    if(a[i]==a[j])
                    {
                        flag=1;
                        break;
                    }
                }
            }
        }
        if(flag==0)
            System.out.print("Unique Number");
        else
            System.out.print("Not Unique Number");
    }
}