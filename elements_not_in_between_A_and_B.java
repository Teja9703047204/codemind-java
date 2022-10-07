import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if (a[i]<x || a[i]>y ) 
            {
                System.out.print(a[i]+" ");
                c++;
            }
        }
        if(c==0)
        {
            System.out.println(-1);
        }
    }
}