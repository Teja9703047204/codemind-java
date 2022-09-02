import java.util.Scanner;
class pal
{
    public static int pal(int n)
    {   
        int t=n,rev=0,r;   
       
            while(n>0)
            {
                r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
        
        if(t==rev)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,b;
        n=sc.nextInt();
        n=Math.abs(n);
        b=pal(n);
        System.out.println(b);
        
    }
}