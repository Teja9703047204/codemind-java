import java.util.Scanner;
class prim
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
    public static boolean pal(int n)
    {
        int r,rev=0,t=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(t==rev)
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
        int n;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(prime(i) && pal(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}