import java.util.Scanner;
public class Chocolate {
  public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
      		System.out.print("Enter no: of chocolates ");
     		 int chocoNumber = s.nextInt();
      		System.out.print("Enter no: of children: ");
      		int childNumber = s.nextInt();
	int i=1;
	while(chocoNumber>=i && i<=childNumber){
	chocoNumber=chocoNumber-i;
	i++;
}
System.out.println("last child who got chocolate"+(i-1));

System.out.println("remaining chocolate"+(chocoNumber));
}
}