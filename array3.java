import java.util.Scanner;
import java.lang.Math;

class array3{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

int sum=0;

System.out.println("Enter no.of elements:");
int n=input.nextInt();
int a[]=new int[n+1];
System.out.println("Enter elements:");
for(int i=1;i<=n;i++)
	{
	a[i]=input.nextInt();
	if(i%2==0)
		{
		sum=sum+(a[i]*a[i]);
		}

	else{sum=sum+(a[i]*a[i]*a[i]);}
	
	}
System.out.println("Sum="+sum);

}
}