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
            if(((int)s.charAt(i)>32 && (int)s.charAt(i)<=47)||((int)s.charAt(i)>=58 && (int)s.charAt(i)<=64)||((int)s.charAt(i)>=91 && (int)s.charAt(i)<=96)||((int)s.charAt(i)>=123 && (int)s.charAt(i)<=126))
            {
                c++;
            }
        }
        System.out.print(c);
    }
}  