import java.util.Scanner;
class faren
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        a=sc.nextInt();
        b=((a-32)*5)/9;
        System.out.printf("%.2f",b);
    }
}