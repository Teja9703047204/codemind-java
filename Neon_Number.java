import java.util.Scanner;
class neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,s,sum=0,r;
        a=sc.nextInt();
        s=a*a;
        while(s>0)
        {
            r=s%10;
            sum=sum+r;
            s=s/10;
        }
        if(a==sum)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}