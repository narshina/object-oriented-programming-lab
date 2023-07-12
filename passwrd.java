import java.util.Scanner;
public class Exceptions
{
public static void main(String args[])
{
System.out.println("enter a no:");
Scanner sc=new Scanner(System.in);
try
{
int n=sc.nextInt();
System.out.println(n);
}
catch(Exception e)
{
System.out.println("passwordexception");  
}
}
}