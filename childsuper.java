 class parent{
void display(){
System.out.println("This is a parent method.........");
	}
}


class childsuper extends parent{
void display(){
super.display();
System.out.println("This is a childmethod.........");
	}

public static void main(String args[]){
parent obj1=new childsuper();
obj1.display();

}
}