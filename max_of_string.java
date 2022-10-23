import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int max=0;
        String s1=sc.nextLine();
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if((int)ch[i]>max)
                max=(int)ch[i];
        }
        System.out.print((char)max);
    }
}