import java.util.Scanner;
class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,d=0,j;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]!=999)
            {
                c=1;
                for(j=0;j<n;j++)
                {
                    if(a[i]==a[j] && i!=j)
                    {
                        c++;
                        a[j]=999;
                    }
                }
                if(a[i]!=999 && a[i]%2==0)
                {
                    d++;
                }
            }
        }
        System.out.println(d);
    }
}