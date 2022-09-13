import java.util.Scanner;
class pr
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
        for(int i=0;i<n;i++)
        {
            int p=1;
            for(int j=0;j<n;j++)
            {
                if(a[i]!=a[j])
                {
                    p=p*a[j];
                }
            }
            System.out.print(p+" ");
        }
    }
}