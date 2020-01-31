public class Add{
public int add(int a,int b){
return(a+b);
}

public int add(int a,int b,int c){
return(a+b+c);
}

public double add(double a,double b){
return(a+b);
}
public static void main(String args[]){
Add obj=new Add();
System.out.println(obj.add(10,20));
System.out.println(obj.add(10,20,70));
System.out.println(obj.add(10.1,20.1));
}
}