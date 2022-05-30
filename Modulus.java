import java.util.Scanner;
class Modulus
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,mod;
        a=sc.nextInt();
        b=sc.nextInt();
        mod=a%b;
        System.out.print(mod);
    }
}