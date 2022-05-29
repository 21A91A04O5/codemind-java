import java.util.Scanner;
class Area_Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float area;
        final double pi=3.14;
        r=sc.nextInt();
        area=(float)pi*r*r;
        System.out.format("%.2f",area);
    }
}