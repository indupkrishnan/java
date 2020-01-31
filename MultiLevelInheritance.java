class multilevelparent{
	protected String str;  
	multilevelparent(){
	str="this ";
	}  
}  
class child extends multilevelparent{  
child(){
str=str.concat("is ");
}
  
}
class childsmall extends child{
childsmall(){
str=str.concat("multi level enheritance..childsmall extends child and child extends multilevel parent. ");
	}

void display(){
System.out.println(str);
	}
}  
class MultiLevelInheritance{  
public static void main(String args[]){  
childsmall cobj=new childsmall();  
  cobj.display();
}}  