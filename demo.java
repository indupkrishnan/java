class parent{}
class child1 extends parent{}
class child2 extends parent{}
class demo{

public static void main(String[] args){
parent p=new parent();
child1 c1=new child1();
child2 c2=new child2();

System.out.println(c1 instanceof parent);

System.out.println(c2 instanceof parent);
System.out.println(p instanceof child1);
System.out.println(p instanceof child2);

p=c1;
System.out.println(p instanceof child1);
System.out.println(p instanceof child2);

p=c2;
System.out.println(p instanceof child1);
System.out.println(p instanceof child2);

}
}