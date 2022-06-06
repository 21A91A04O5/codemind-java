import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int sum=0;
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
               sum=sum+Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
    }
}