import java.util.Scanner;
class pretty
{
    public static boolean num(int n)
    {
        int a;
        a=n%10;
        if(a==2 || a==3 || a==9)
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
            int a,b,c=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(int j=a;j<=b;j++)
            {
                if(num(j))
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}