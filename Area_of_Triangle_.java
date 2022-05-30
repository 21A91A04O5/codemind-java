import java.util.Scanner;
class Area_
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float s;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float area;
        s=(float)(a+b+c)/2;
        area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
    }
}