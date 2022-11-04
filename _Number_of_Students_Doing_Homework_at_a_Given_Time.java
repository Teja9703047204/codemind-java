import java.util.Scanner;
class Home
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,q,c=0;
        a=sc.nextInt();
        int n[]=new int[a];
        for(int i=0;i<a;i++)
        {
            n[i]=sc.nextInt();
        }
        b=sc.nextInt();
        int m[]=new int[b];
        for(int i=0;i<b;i++)
        {
            m[i]=sc.nextInt();
        }
        q=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            if(n[i]<=q && m[i]>=q)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}