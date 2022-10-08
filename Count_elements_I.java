import java.util.Scanner;
class cnt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int l1[]=new int[a];
        int l2[]=new int[b];
        for(int i=0;i<a;i++)
        {
            l1[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            l2[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(l1[i]!=-999)
            {
                for(int j=0;j<a;j++)
                {
                    if(l1[i]==l1[j] && i!=j)
                    {
                        l1[j]=-999;
                    }
                }
            }
        }
        for(int i=0;i<b;i++)
        {
            if(l2[i]!=-989)
            {
                for(int j=0;j<b;j++)
                {
                    if(l2[i]==l2[j] && i!=j)
                    {
                        l2[j]=-989;
                    }
                }
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(l1[i]==l2[j])
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}