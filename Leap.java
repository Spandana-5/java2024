import java.util.*;
class Leap
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
if((n%4==0)&&(n%100!=0||n%400==0)){
System.out.println("leap year");
}
else{
System.out.println("not leap year");
}


}
}

