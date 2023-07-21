import java.util.Scanner;
class Three implements Runnable
{
public void run()
{
int i;
for(i=1;i<30;i++)
{
if(i%3!=0)
{
System.out.println(i);
}
}
}
}
class Prime implements Runnable
{
int n,i,count,j;
Scanner sc=new Scanner(System.in);
public void run()
{
System.out.println("enter the range:");
n=sc.nextInt();
System.out.println("prime numbers are:");
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
class Main
{
public static void main(String args[])
{
Three a1=new Three();
Thread t1=new Thread(a1);
Prime p1=new Prime();
Thread t2=new Thread(p1);
t1.start();
t2.start();
}
}
