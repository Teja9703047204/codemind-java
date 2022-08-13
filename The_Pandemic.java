import java.util.Scanner;
class pandemic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a<=3)
        {
            System.out.println(a-1);
        }
        else
        {
            System.out.println("2");
        }
    }
}