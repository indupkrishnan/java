 
import java.util.Scanner;
public class Lucky {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter bill number: ");
      int billNumber = s.nextInt();
      System.out.print("Enter day: ");
      int day = s.nextInt();
     	if(day>0 && day<=31){
	if(((billNumber%100)==day)||(billNumber%day==0)){
      	System.out.println("you are a lucky customer");
  				 }
	else{
	System.out.println("Better luck next time.");
	}
		}
}
}