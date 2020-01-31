import java.util.Scanner;
class array2{
public static void main(String[] argsg){
Scanner input=new Scanner(System.in);

int count=0,k=0;
int c[]=new int[10];

System.out.println("Enter no.of elements in array1:");
int n=input.nextInt();
int a[]=new int[n];
System.out.println("Enter elements for array1:");
for(int i=0;i<n;i++){a[i]=input.nextInt();}

System.out.println("Enter no.of elements in array2:");
int m=input.nextInt();
int b[]=new int[m];
System.out.println("Enter elements for array2:");
for(int i=0;i<m;i++){b[i]=input.nextInt();}
System.out.println(" repeated numbers:");
for(int j=0;j<m;j++){
			for(int i=0;i<n;i++)
			{
			if(a[i]==b[j]){
			System.out.println(a[i]);
			count++;
			}
			}}
		   
for(int i=0;i<n;i++)
	{
	for(int j=0;j<m;j++)
	{if(b[j]==a[i]){System.out.println(b[j]);count++;}
	}
	}


System.out.println("count:"+count);
}

}