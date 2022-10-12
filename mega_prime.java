import java.util.Scanner;
class mega
{
    public static boolean prime(int n)
    {
        int c=0;
        if(n<2)
        {
            return false;
        }
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
        int n,r=0,f=0;
        n=sc.nextInt();
        if(prime(n)==false)
        {
            System.out.println("Not Mega Prime");
        }
        else{
        if(prime(n))
        {
            while(n>0)
            {
                r=n%10;
                if(prime(r)==false)
                {
                    f=1;
                    break;
                }
                n=n/10;
            }
        }
        if(f==0)
        {
            System.out.println("Mega Prime");
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
        }
    }
}