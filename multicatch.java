class multicatch{
public static void main(String[]args){
try{
int a[]=new int[5];
a[8]=23/0;
}
catch(ArithmeticException e)
{System.out.println("Arithmetic exception occurs");}

catch(ArrayIndexOutOfBoundsException e)
{System.out.println("Arithmetic exception occurs");}

catch(Exception e)
{System.out.println("Arithmetic exception occurs");}
System.out.println("Rest of the code");
}
}