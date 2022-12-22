import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        String b="";
        a=sc.nextInt();
        if(a%3==0)
           b=b+"Pling";
        if(a%5==0)
           b=b+"Plang";
        if(a%7==0)
           b=b+"Plong";
        if(b=="")
           System.out.print(a);
        else   
           System.out.println(b);   
    }
}