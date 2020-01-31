/*3. 
Character experience is one of the main attractions in the Disneyland.
'Alice' from the movie 'Alice in Wonderland' is one of the famous characters. 
Patrick and Johnny just reached Disneyland and decided to have character
 experience. Since both of them like Alice, they decided to visit Alice
 first.
To their surprise, Alice was missing. 
Then they realized that they have to solve puzzle to meet Alice.
They found many ways numbered from 1,2,3,........18.
They were confused about the way that will lead them to Alice.
They found a cute bird, standing in one of the tree.
The bird was chirping a number. They realised that the number was the
clue to find the correct path.
They also found a note with a message- 'sum the digits'.
 That is, if the bird said 23, then the 5th (2+3=5) way will lead them to
 Alice's place. They were already confused, so pls help Patrick and
 Johnny in finding the correct route... 

Input Format:
Input consists of an integer corresponding to the 2-digit number.

SAMPLE INPUT & OUTPUT:
~~~~~~~~~~~~~~~~~~~~
The bird said :
23
Patrick and Johnny must go in path-5 to find Alice
----------------------------------------------------*/

import java .util .Scanner;
public class Bird{
public static void main(String args[]){
int v,num;
int sum=0;
Scanner name=new Scanner(System.in);
System.out.println("Enter the number chirped by bird");
v=name.nextInt();
while(v>0){
num=v%10;
sum=sum+num;
v=v/10;
}
System.out.println("path is "+sum);
}
}