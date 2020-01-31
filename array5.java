import java.util.Scanner;

class array5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter no.of elements in array:");
int n=sc.nextInt();

int a[]=new int[n];
int b[]=new int[n];

System.out.println("Enter elements of array1:");
for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}

System.out.println("Enter elements of array2:");
for(int i=0;i<n;i++)
	{
	b[i]=sc.nextInt();
	}

System.out.println("Output:");
for(int i=0;i<n;i++){
	if(i%2==0){
		System.out.println(b[i]);
		}
	else{ System.out.println(a[i]);
		}
	}
}

}