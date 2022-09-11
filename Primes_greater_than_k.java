import java.util.Scanner;
class greater
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
        int n,m,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(prime(a[i]) && a[i]>=m)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}