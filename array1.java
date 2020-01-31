import java.util.Scanner;
class array1{
public static void main(String args[]){
Scanner input=new Scanner(System.in);

System.out.println("Enter no.of elements in array:");
int n=input.nextInt();

int a[]=new int[n];
int sum=0;
int p=0;

System.out.println("Enter elements in array:");
for(int i=0;i<n;i++){
		     int count=0;
 		     a[i]=input.nextInt();
		if(i>=2){
		     for(int j=2;j<=i;j++){
			if(i%j==0){count=count+1;}
			}
   		     if(count<2){sum=sum+a[i];p++;}		   
		    }
		}
System.out.println(sum);
System.out.println(p);
int avg=sum/p;
System.out.println("Average:"+avg);
}
}