import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum;
        n=sc.nextInt();
        sum=(int)(n*(n+1))/2;
        System.out.print(sum);
    }
}