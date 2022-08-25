import java.util.Scanner;
class faren
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        a=sc.nextInt();
        b=((a*9)/5)+32;
        System.out.printf("%.2f",b);
    }
}