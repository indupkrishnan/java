interface bank{  
float getrate();
}
  
class axis implements bank{  
public float getrate(){return 12.9f;}
}  
 
class sbi implements bank{  
public float getrate(){return 17.9f;}
}  
class interfacebank{  
public static void main(String args[]){
bank b=new axis();  
System.out.println("rate is "+b.getrate());
bank b1=new sbi(); 
System.out.println("rate is "+b1.getrate());
}}  