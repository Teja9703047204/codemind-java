import java.util.Scanner;
class auto
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n,b,c,sq;
 n=sc.nextInt();
 sq=n*n;
 b=(int)Math.log10(n)+1;
 c=sq%(int)Math.pow(10,b);
 if(n==c)
 {
  System.out.println("Automorphic Number");
 }
 else
 {
  System.out.println("Not an Automorphic Number");
 }
}
}