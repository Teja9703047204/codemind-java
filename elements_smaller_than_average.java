import java.util.Scanner;
class av
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,sum=0;
        float avg=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        avg=(float)sum/n;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=avg)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}