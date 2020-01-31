 abstract class bank{  
 abstract int getrate();
}
  
class axis extends bank{  
int getrate(){return 12;}
}  
 
class abstractbank{  
public static void main(String args[]){
bank b=new axis();  
System.out.println("rate is"+b.getrate());
}}  