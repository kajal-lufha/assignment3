import java.util.Scanner;
class pallindrome
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.println("Enter any number");
int a=S.nextInt();
int b=a;
int rev=0;
while(b!=0)
{
int rem=b%10;
rev=((rev*10)+rem);
b=b/10;
}
if(a==rev)
{
System.out.println("Pallindrome");
}
else
{
System.out.println("Not pallindrome");
}
}
}

