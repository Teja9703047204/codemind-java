import java.util.Scanner;
class times
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,m,f=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]!=-999)
            {
                c=1;
                for(int j=0;j<n;j++)
                {
                    if(a[i]==a[j] && i!=j)
                    {
                        c=c+1;
                        a[j]=-999;
                    }
                }
                if(c==m)
                {
                    System.out.print(a[i]+" ");
                    f=1;
                }
            }
        }
        if(f==0)
        {
            System.out.println(-1);
        }
    }
}