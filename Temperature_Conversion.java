import java.util.Scanner;
class degree
{
    public static void main(String args[])
    {
        double c,f;
        Scanner sc=new Scanner(System. in);
        c=sc.nextInt();
        f=(9*c/5)+32;
        System.out.printf("%.2f",f);
    }
}