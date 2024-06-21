import java.util.*;
class VowCon
{
public static void main(String[] args)
{
char a;
Scanner s=new Scanner(System.in);
a=s.next().charAt(0);
if((a=='a')||(a=='e')||(a=='i')||(a=='u')||(a=='o')||(a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U'))
{
System.out.println("vowel");
}
else
{
System.out.println("con");
}
}
}