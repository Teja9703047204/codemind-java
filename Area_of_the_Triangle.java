import java.util.Scanner;
import java.lang.Math;
class area
{
    public static void main(String args[])
    {
        double a,b,c,s,area;
        Scanner sc=new Scanner(System. in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}