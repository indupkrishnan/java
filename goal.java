 class bike{

 bike(){System.out.println("bike super class");}  //construcor
}


class cycle1 extends bike{
cycle1()
{
super();
System.out.println("cycle1 sub class");
	}
}
class goal{
public static void main(String args[]){
cycle1 c1=new cycle1();


}
}