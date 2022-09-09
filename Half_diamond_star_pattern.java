import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>=3 && n<=100)
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < i + 1; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i < n; i++)
            {
                for (int j = i; j < n; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("The pattern is not possible");
        }
        
    }
}