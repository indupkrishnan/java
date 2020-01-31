class anonymousarray{

 static void printArray(int arr[]){
int min=arr[0];
for(int i=0;i<arr.length;i++)
  
System.out.println(arr[i]);
}
public static void main(String[]args){
printArray(new int[]{2,4,5});

}}