import java.util.*;
class BinaryPalin
{
public static void main(String[] args)
{
int n,rem,rev=0,temp;
Scanner s =new Scanner(System.in);
n=s.nextInt();
temp=n;
while(n>0)
{
rem=n%2;
n=n/2;
rev=rev*2+rem;
}
if(temp==rev)
{
System.out.println("given number is binary palindrome");
}
else
{
System.out.println("given number is not binary palindrome");
}
}
}


