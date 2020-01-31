 class bike{

bike(){System.out.println("bike super class");}
}


class cycle1 extends bike{
cycle1()
{
super();
System.out.println("cycle1 sub class");
	}

public static void main(String args[]){
cycle1 c1=new cycle1();


}
}