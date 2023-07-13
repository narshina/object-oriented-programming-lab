import java.util.Scanner;
class Mul extends Thread
{
void display()
{
int i;
for(i=1;i<11;i++)
{
int a=i*5;
System.out.println(i+" * 5 ="+a);
}
}
}
class Primenumber extends Thread
{
int n,i,count,j;
Scanner sc=new Scanner(System.in);
void print()
{
System.out.println("enter the limit:");
n=sc.nextInt();
System.out.println("prime numbers");
for(i=1;i<=n;i++)
{
count=0;
for(j=2;j<=(i/2);j++)
{
if(i%j==0)
{
count++;
}
}
if(count==0)
{	
System.out.println(i);
}
}
}
}
class Main2
{
public static void main(String args[])
{
Mul m1=new Mul();
Primenumber p1=new Primenumber();
m1.display();
p1.print();
}
}
		