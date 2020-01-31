
class InvalidPanNumberException extends Exception{
InvalidPanNumberException(String s){
super(s);
}
}

 class customexception{
 static void validate(int age)throws InvalidAgeException{
if(age<18)
throw new InvalidAgeException("not eligible");
else
System.out.println("a/c is opened.");
}
public static void main(String args[]){
try{
validate(13);
}
catch(Exception m){System.out.println("Exception occured: "+m);}
System.out.println("further process");
}
}
