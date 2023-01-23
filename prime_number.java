import java.util.Scanner;
class Sample
{
  static boolean prime(int n)
  {
    int f=0,i;
    if(n==1)
       return false;
    else
    {
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
               f=1;
               break;
            }   
        }
        if(f==0)
           return true;
        else
           return false;
    } 
  }  
  public static void main(String args[])
  {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(Sample.prime(n))
          System.out.print("prime");
      else
          System.out.print("not a prime");
  }
}