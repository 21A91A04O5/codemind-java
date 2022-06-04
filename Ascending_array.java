import java.util.Scanner;
class AscendingArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[],n,i,found=0;
        n=sc.nextInt();
        A=new int[n];
        for( i=0;i<n;i++)
            A[i]=sc.nextInt();
        for( i=0;i<n-1;i++)
        {
            if(A[i]>=A[i+1])
            {
                found=1;
                break;
            }
        }
        if(found==0)
           System.out.print("yes");
        else
           System.out.print("no");
    }
}