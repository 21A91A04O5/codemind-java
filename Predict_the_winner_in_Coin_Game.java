import java.util.Scanner;
class Winner_coingame
{
    public static void main(String args[])
    {
        int M,N;
        Scanner sc=new Scanner(System.in);
        M=sc.nextInt();
        N=sc.nextInt();
        if(M%2==0 || N%2==0)
            System.out.print("Player 1");
        else
            System.out.print("Player 2");
    }
}