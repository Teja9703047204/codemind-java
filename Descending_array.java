import java.util.Scanner;
class ascend
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<=a[i+1])
            {
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("yes");
    }
}