import java.util.Scanner;
public class Offer1 {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of items purchased: ");
	int purchaseNumber=s.nextInt();
	
	
	int x;
	int min=1000000;
	int price=0;
	double discount=0;
	System.out.println("enter prices");
        for(int i=0;i<purchaseNumber;i++){//for reading array
            x=s.nextInt();
	   price=price+x;
        
	if(x<min){
	min=x;
	}

	}
  
discount=discount+(price*0.2);
if(discount<min){
System.out.println("offer2-free");
}
else{System.out.println("offer1-20%discount");
}
}
}