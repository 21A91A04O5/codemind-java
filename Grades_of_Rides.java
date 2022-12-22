import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int h,s,spe;
        String a;
        a=sc.nextLine();
        String[] se=a.split(" ");
        h=Integer.parseInt(se[0]);
        s=Integer.parseInt(se[1]);
        spe=Integer.parseInt(se[2]);
        if((h>50 && s>60)&& spe>100)
            System.out.print("10");
        else if(h>50 && s>60)
            System.out.print("9");
        else if(s>60 && spe>100)
            System.out.print("8");
        else if(h>50 && spe>100)
            System.out.print("7");
        else if(h>50 || s>60 || spe>100)
            System.out.print("6");
        else
            System.out.print("5");
    }
}