import java.util.Scanner;
class primed
{
    public static boolean prime(int n)
    {
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,f=0;
        n=sc.nextInt();
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if((n%i==0) && prime(i) && prime(n/i) && i!=(n/i))
            {
                System.out.print(i+" "+n/i);
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println(-1);
        }
    }
}