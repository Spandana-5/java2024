/*to read values at time of runtime in java using scanner class.scanner class in java.util pacakge scanner class introduced in jdk1.5 */
import java.util.*;
class Input{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println("sum="+c);
}
}