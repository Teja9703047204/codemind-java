import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,sum=0,a;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a=sc.nextInt();
                sum=sum+a;
            }
        }
        System.out.println(sum);
    }
}