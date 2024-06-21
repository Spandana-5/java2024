import java.util.*;
class Perfect
{
public static void main(String[] args)
{
int n,s=0,temp;
Scanner s1=new Scanner(System.in);
n=s1.nextInt();
temp=n;
for( int i=0;i<=n;i++)
{
if(n%i==0)
{
s=s+i;
}
}
if(temp==s)
{
System.out.println("Perfect Number");
}
else{
System.out.println("not perfect Number");
}
}
}


