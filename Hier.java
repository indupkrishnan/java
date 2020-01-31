class A{
	void display1(){
	System.out.println("super class A");
	}  
}  
class B extends A{  
 void display2(){
System.out.println("Sub clss B");
	}
}
  

class C extends A{
 void display3(){
System.out.println("Sub clss C");
}
}

class Hier{  
public static void main(String args[]){  
A obj1=new A();
B obj2=new B();
C obj3=new C();
obj1.display1();
obj2.display1();
obj3.display1();
}}  