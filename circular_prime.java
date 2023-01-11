import java.util.Scanner;
class Sample
{
  public static int reverse(int n) 
  {
   int re=0,r;
   while(n>0)
   {
      r=n%10;
      re=re*10+r;
      n=n/10;
    }
    return re;
  }   
  public static boolean prime(int n)
  {
   int i,f=0;
   if(n==1)
      return false;
   else
   {
     for(i=2;i<=(int)Math.sqrt(n);i++)
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
     if(Sample.prime(n) && Sample.prime(Sample.reverse(n)))
        System.out.println("circular prime");
     else if(Sample.prime(n))
        System.out.println("prime but not a circular prime");
     else
        System.out.println("not prime");
    }    
}