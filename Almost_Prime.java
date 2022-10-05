import java.util.Scanner;
class almost
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
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a,c=0;
            a=sc.nextInt();
            for(int j=1;j<=a;j++)
            {
                for(int k=2;k<=a;k++)
                {
                    if(j*k==a && j!=k && prime(j) && prime(k) && j!=1 && k!=1)
                    {
                        c++;
                        break;
                    }
                }
            }
            if(c>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}