class student{
int id;
String name;
  void insertdata(int id1,String n){
	id=id1;
	name=n;
	}
   void display(){
System.out.println(id+" "+name);}
}
class bymethod{
public static void main(String[]args){
student s1=new student();
student s2=new student();
s1.insertdata(101,"raju");
s2.insertdata(102,"ramu");
s1.display();
s2.display();
}

}