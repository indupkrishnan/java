 class bike{

int speed=90;
}


class cycle extends bike{
int speed=50;
void display()
{
System.out.println("Avg speed:"+super.speed);
System.out.println("Avg speed:"+speed);
	}

public static void main(String args[]){
cycle c1=new cycle();
c1.display();

}
}