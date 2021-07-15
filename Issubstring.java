import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String1 : ");
String s1=sc.next();
System.out.println("Enter String2 : ");
String s2=sc.next();
boolean st=issubstring(s1,s2);
if(st)
System.out.println("The s2 is substring of s1");
else
System.out.println("The s2 is not substring of s1");
}
static boolean issubstring(String s1,String s2)
{
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
int m=ch1.length;
int n=ch2.length;
int c=1;
boolean st;
for(int i=0;i<=m-n;i++)
{
for(int j=0;j<n;j++)
{
if(ch1[i+j]!=ch2[j])
{
break;
}
c++;
}
if(c==n)
{
return false;
}
}
return true;
}
}


