import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int c=1;
        for(int i=1;i<s1.length();i++)
        {
            if(s1.charAt(i)>=65 && s1.charAt(i)<=90)
                c++;
        }
        System.out.print(c);
    }
}