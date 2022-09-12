import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,c=0;
        float avg=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        avg=sum/n;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=avg)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}