import java.util.Scanner;
class greatest
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.println("Enter any 3 numbers");
int a=S.nextInt();
int b=S.nextInt();
int c=S.nextInt();
if(a>b&&a>c)
{
System.out.println(a+" is greatest of all");
}
else if(b>c&&b>a)
{
System.out.println(b+" is greatest of all");
}
else if(c>a&&c>b)
{
System.out.println(c+" is greatest of all");
}
else
{
System.out.println("error");
}
}
}
