import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>0)
          System.out.println("Positive Number");
        else if(n<0)
          System.out.println("Negative Number");
    }
}