import java.util.Scanner;
class div
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,count=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}