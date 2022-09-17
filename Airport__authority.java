import java.util.Scanner;
class fact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]>k)
            {
                c++;
            }
        }
        System.out.println(n+c);
    }
}