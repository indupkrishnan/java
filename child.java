 class parentwithoutsuper{
void display(){
System.out.println("This is a parent method.........");
	}
}


class child extends parentwithoutsuper{
	void display(){
	System.out.println("This is a childmethod.........");
		}

	public static void main(String[] args){
	parentwithoutsuper obj1=new parentwithoutsuper();
	obj1.display();
	parentwithoutsuper obj2=new child();
	obj2.display();
						}
}