import java.util.*;
class Reverse
{
public static void main(String[] args)
{
int n,rem,rev=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
rem=n%10;
n=n/10;
rev=rev*10+rem;
}
System.out.println(rev);
}
}

