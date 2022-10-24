import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        for(int j=0;j<s1.length;j++)
        {
             int c=0;
             for(int i=0;i<s1[j].length();i++)
             {
                 if(s1[j].charAt(i)=='a' || s1[j].charAt(i)=='e' || s1[j].charAt(i)=='i' || s1[j].charAt(i)=='o' || s1[j].charAt(i)=='u' || s1[j].charAt(i)=='A' || s1[j].charAt(i)=='E' || s1[j].charAt(i)=='I' || s1[j].charAt(i)=='O' || s1[j].charAt(i)=='U')
                 {
                    c++;
                 }
             }
             System.out.print(c+" ");
        }
    }
}