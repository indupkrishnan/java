class  A{
int i,j;
void sum(int x,int y)
{k=i+j;
System.out.println("sum of i and j is :"+k);
}
}

class B extends A{
void subtract(int x,int y){
m=i-j;
System.out.println("Difference of i and j is :"+m);}

}

class Inheritancemy{
public static void main(String [] args){
B b1=new B();
b1.sum(4,5);
b1.subtract(4,5);
}}