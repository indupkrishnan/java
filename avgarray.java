import java.util.*;
import java.lang.*;
class avgarray{

public static void main(String[]args){
Scanner name=new Scanner(System.in);
int n;
System.out.println("Enter the number of elements");
 n=name.nextInt();

int a[]=new int[n];
System.out.println("Enter the elements");
int i;
int sum=0;
int avg=0;
for(i=0;i<n;i++){
a[i] = name.nextInt();
sum = sum + a[i];}
avg=sum/n;
System.out.println(a[i]);

}
}
 