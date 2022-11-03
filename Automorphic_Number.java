import java.util.Scanner;
class auto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s;
        n=sc.nextInt();
        s=n*n;
        String s1=String.valueOf(n);
        String s2=String.valueOf(s);
        if(s2.endsWith(s1))
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}