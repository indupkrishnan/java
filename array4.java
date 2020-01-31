import java.util.Scanner;

class array4{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

int sum=0;

System.out.println("Enter no.of elements in array:");
int n=input.nextInt();

int a[]=new int[n];

System.out.println("Enter array elements:");
for(int i=0;i<n;i++)
	{
	a[i]=input.nextInt();
	if(i%2==0)
	  {
	   sum=sum+i*a[i];
	  }
	}
System.out.println("Sum of odd position multiplied by index="+sum);
}

}