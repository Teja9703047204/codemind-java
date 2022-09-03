import java.util.Scanner;
class cnt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,e=0,o=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
        }
        System.out.print(e+" "+o);
    }
}