import java.util.*;
class ProdDigit
{
public static void main(String[] args)
{
int n,prod=1,rem;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
rem=n%10;
n=n/10;
prod=prod*rem;
}
System.out.println(prod);
}
}

