import java.util.Scanner;
class fibonacii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,n,c;
        a=0;
        b=1;
        System.out.print(a+" "+b+" ");
        n=sc.nextInt();
        for(int i=1;i<=(n-2);i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}