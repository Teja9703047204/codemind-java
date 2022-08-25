import java.util.Scanner;
class sub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,pro=1,r,c;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        if(sum>pro)
        {
            c=sum-pro;
        }
        else
        {
            c=pro-sum;
        }
        System.out.println(c);
    }
}