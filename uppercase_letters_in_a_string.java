import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}    