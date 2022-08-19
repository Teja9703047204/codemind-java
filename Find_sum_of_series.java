import java.util.Scanner;
class sum1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float sum;
        sum=0;
        n=sc.nextInt();
        for (float i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.printf("%.2f",sum);
    }
}