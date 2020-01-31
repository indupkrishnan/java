class array{

public static void main(String[]args){
int a[]=new int[5];
int i;
a[0]=3;
a[1]=8;
a[2]=4;
a[3]=22;
a[4]=6;
for(i=0;i<a.length;i++)
System.out.println(a[i]);

int b[]={1,2,3,4};
for(i=0;i<b.length;i++)
System.out.println(b[i]);

int b1[]={1,2,3,4};
for(int j:b1)
System.out.println(j);

}
}