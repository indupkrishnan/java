/*------------------------------------------------------------------------------
5.The next game for the kids was based on Chess Board.
 
All kids were asked the same question ""How many bishops can be placed on a 
chessboard without threatening each other? The Chess Board size is N*N".
Mahirl wanted to participate in this game too.
Sita knows that a bishop's moves are quite complicated and it is difficult to
 make a 4—year kid understand the bishop moves. A bishop can move to any 
distance in any of the four diagonal directions. A bishop threatens another
 bishop if it can move to the other bishop's position.
Sita needs to find a way in which Mahirl could give the correct anwer to this 
question. Mahirl is good at addition and subtraction. She is not familiar
 with other arithmetic operations yet.
Help Sita to compute the maximum number of bishops that can be placed on a chessboard in such a way that no two bishops threaten each other and to make Mahirl win in this game too.

Input Format:
~~~~~~~~~~~~~
Input consists of a single integer N representing the size of the i-th
 chessboard. [N <= 100000]
Output Format:
~~~~~~~~~~~~~
Output consists of a single integer , the maximum number of bishops that can
 be placed on the chessboard without threatening each other.

Sample Input1:
2
Sample Output1:
2

Sample Input2:
4
Sample Output2:
6

------------------------------------------------------------------------------*/


import java.util.Scanner;
class chess{
public static void main(String [] args){
Scanner name=new Scanner(System.in);
System.out.println("enter size of board");
int size=name.nextInt();
int max=size+(size-2);
System.out.println("max number of bishops "+max);

}}