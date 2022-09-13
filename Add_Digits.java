import java.util.Scanner;
class first
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sum=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
            if(sum>9 && n==0)
            {
                n=sum;
                sum=0;
            }
        }
        System.out.println(sum);
    }
}