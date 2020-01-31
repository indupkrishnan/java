class fiboanonymous{
void c(int n){
 int  a = 0, b = 0, c = 1;

for(int i = 1; i <=n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            
        }
System.out.println("fibonacci is :"+c);
}
public static void main(String[]args){
new fiboanonymous().c(3);
}
}