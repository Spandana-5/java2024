import java.util.*;
class SumDigit
{
public static void main(String[] args)
{
int n,rem,sum=0;
Scanner s= new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
rem=n%10;
n=n/10;
sum=sum+rem;
}
System.out.println(sum);
}
}
