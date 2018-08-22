import java.util.Scanner;
class prime
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.print("Enter any number");
int a=S.nextInt();
int flag=0;
for(int i=2;i<=a/2;i++)
{
if(a%i==0)
{
flag=1;
}
}
if(flag==0)
{
System.out.print("Number is prime");
}
else
{
System.out.print("Number is not prime");
}
}
}

