import java.util.Scanner;
class AgeException extends Exception
{
AgeException(String str)
{
super(str);
}
}
class AgeValid
{
void validate(int age) throws AgeException
{
if(age<18)
{
throw new AgeException("age is not valid to vote");
}
else
{ 
System.out.println("eligible for voting");
}
}
}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in) ;
System.out.println("Enter your age:");
int n=sc.nextInt();
try
{
AgeValid a=new AgeValid();
a.validate(n);
}
catch (AgeException ex)
{ 
System.out.println("caught the exception......");
System.out.println(" exception occured:"+ex);
}
}
}