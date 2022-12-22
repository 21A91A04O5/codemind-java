import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        float f;
        c=sc.nextInt();
        f=32+(float)(c*9)/5;
        System.out.format("%.2f",f);
    }
}