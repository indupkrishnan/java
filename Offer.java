import java.util.Scanner;
public class Offer {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of items purchased: ");
	int purchaseNumber=s.nextInt();
	int arr[]=new int[purchaseNumber];
	System.out.println("enter elements");

        for(int i=0;i<purchaseNumber;i++){//for reading array
            arr[i]=s.nextInt();

        			}
	int min=1000000;
	int price=0;
	double discount=0.2;
         for(int i=0;i<purchaseNumber;i++){ //for printing array
		price=price+arr[i];
}	
		discount=discount*(price);
			
            System.out.println(discount);

        

}
    

}