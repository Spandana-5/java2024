import java.util.*;
class Palindrome
{
public static void main(String[] args)
{
int n,temp,rem,rev=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
n=n/10;
rev=rev*10+rem;
}
if(temp==rev)
{
System.out.println("given number is palindrome");
}
else
{
System.out.println("given number is not a palindrome");
}
}
}