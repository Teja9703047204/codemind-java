import java.util.Scanner;
class three
{
    public static boolean Three(int n)
    {
        int cnt=0;
        if(n==1)
        return false;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                cnt++;
            }
        }
        if(cnt==2)
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
        int n,c=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if((i*i)<=n)
            {
                if(Three(i*i))
                {
                    c++;
                }
            }
            else
            {
                break;
            }
        }
        System.out.println(c);
    }
}