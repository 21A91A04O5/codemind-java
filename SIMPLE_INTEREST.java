import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,s;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a*b*c)/100;
        System.out.print(s);
    }
}