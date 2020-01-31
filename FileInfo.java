
import java.io.File;
import java.io.IOException;
public class FileInfo{
public static void main(String [] args){

File obj=new File("D:f1.txt");
if(obj.exists()){
System.out.println("File name "+obj.getName());
System.out.println("absolute path  "+obj.getAbsolutePath());
System.out.println("writeable "+obj.canWrite());
System.out.println("readable "+obj.canRead());
System.out.println("File size in bytes"+obj.length());
}else{
System.out.println("File not exists..");

}
}
}