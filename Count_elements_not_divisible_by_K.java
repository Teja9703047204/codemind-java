import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int l[]=new int[a];
        for(int i=0;i<a;i++)
        {
            l[i]=sc.nextInt();
            if(l[i]%b!=0)
            {
                c=c+1;
            }
        }
        System.out.println(c);
    }
}