import java.util.Scanner;
class Table
{
    public static void main(String[] args)
    {
        int n,r,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();
        for(i=1;i<=r;i++)
        {
            if(i%2!=0)
               System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}