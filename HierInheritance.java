class A{
	public void methoda{
	System.out.println("super class A");
	}  
}  
class B extends A{  
public void methodb{
System.out.println("Sub clss B");
	}
}
  

class C extends A{
public void methodc{
System.out.println("Sub clss C");
}
}

class HierInheritance{  
public static void main(String args[]){  
A obj1=new A();
B obj2=new B();
C obj3=new C();
obj1.methoda();
obj2.methoda();
obj3.methoda();
}}  