import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        double a,b,avg;
        Scanner sc=new Scanner(System. in);
        a=sc.nextInt();
        b=sc.nextInt();
        avg=(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}