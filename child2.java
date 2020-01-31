class parent2{}
public class child2 extends parent2{
public void check(){System.out.println("Successful casting");}
public static void show(parent2 p)
{
if(p instanceof child2){
child2 b1=(child2)p;
b1.check();
}
}
public static void main(String[]args){
parent2 p=new child2();
child2.show(p);

}
}