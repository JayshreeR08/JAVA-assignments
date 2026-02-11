import java.util.Scanner;
public class Addition{

public static int add(int a,int b)
{
return a+b;
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int result=add(a,b);
System.out.println(result);
}
} 
