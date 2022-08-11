import java.util.Scanner;
class Hands
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a%2==1)
        {
            System. out.println(a*((a-1)/2));
        }
        else if(a%2==0)
        {
            System. out.println((a-1)*(a/2));
        }
    }
}