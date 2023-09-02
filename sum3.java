class abc
{
int x,y,z;

public abc (int a,int b,int c)
{
x=a;
y=b;
z=c;
System.out.println(x+y+z);
}
}
class sum3
{
public static void main(String[] args)
{
abc n=new abc (10,11,12);
abc n1=new abc (14,15,16);
}
}
