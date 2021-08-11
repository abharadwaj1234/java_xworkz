class ArithmaticOperatorsDemo{

int add(int a,int b)
{
int addResult=a+b;
return addResult;
}

int sub(int x,int y)
{
int subResult=x-y;
retrun subResult;
}

int mul(int p,int q)
{
int mulResult=p*q;
return mulResult;
}

int modulus(int e,int f)
{
int modulusResult=e%f;
return modulusResult;
}

public static void main(String[] args)
{
int addResult1=add(10,20);
System.out.println("addResult:"+addResult);
int subResult1=sub(200,100);
System.out.println("subResult:"+subResult);
int mulResult1=mul(4,5);
System.out.println("mulResult1:"+mulResult);
int modulusResult1=modulus(10,3);
System.out.println("modulusResult:"+modulusResult);
}
}