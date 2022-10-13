import java.util.Scanner;
class self
{
    public static boolean self(int n)
    {
        int r,f=0,t=n;
        while(n>0)
        {
            r=n%10;
            if(r!=0)
            {
                if(t%r!=0)
                {
                    f=1;
                }
            }
            else
            {
                f=1;
            }
            n=n/10;
        }
        if(f==0)
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
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(self(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}