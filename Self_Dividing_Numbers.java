import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,r,n,c,count;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            n=i;
            c=0;
            count=0;
            while(n>0)
            {
                r=n%10;
                n=n/10;
                c++;
                if(r==0)
                    break;
                if(i%r==0 && r!=0)
                    count++;
            }
            if(c==count)
               System.out.print(i+" ");
        }
    }
}