import java.util.*;
class Div
{
public static void main(String[] args)
{
int a,b;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
if(b==0)
{
System.out.println("b cannot be zero");
b=1;
}
int r=a/b;
System.out.println(r);
}
}