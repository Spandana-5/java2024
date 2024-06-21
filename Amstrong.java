import java.util.*;

class Amstrong
{
public static void main(String[] args)
{
int n,d=1,rem,temp;
Scanner s=new Scanner(System.in);
n=s.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
n=n/10;
d=d+rem*rem*rem;
}
if(temp==d)
{
System.out.println("armstrong number");
}
else
{
System.out.println("not armstrong number");
}
}
}
