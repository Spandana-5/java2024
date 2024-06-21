import java.util.*;
class Quadratic
{
public static void main(String[] args)
{
int a,b,c;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
int r=b*b-4*(a*c);
if(r<0)
{
System.out.println("roots are not possible");
}
else
{
float r1=(float)(-b+Math.sqrt(r))/2*a;
float r2=(float)(-b-Math.sqrt(r))/2*a;
System.out.println(r1);
System.out.println(r2);
}
}
}

