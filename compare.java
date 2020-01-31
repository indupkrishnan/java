class compare{
public static void main(String[]args){
String s1="Java";
String s2="Java";
String s3=new String("Java");
String s4="Python";
String s5="JAVA";
String s6="Mava";
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equalsIgnoreCase(s5));


System.out.println(s1.equals(s4));

System.out.println(s1.compareTo(s2));
System.out.println(s1.compareTo(s6));
System.out.println(s6.compareTo(s1));



}
}