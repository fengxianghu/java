class ArrayCopDemo{

public static void main(String[] args) {
	int[] a = new int[]{10,78,20,47,39};
	int[] b = new int[5];
ArrayCopDemo.print(a);
//ArrayCopDemo.copy(a,2,2,b,5);
ArrayCopDemo.print(b);
int[] c= ArrayCopDemo.arraySort(a);
ArrayCopDemo.print(c);


}

static int[] arraySort(int[] a){
int var = 0;
for (int i =a.length ;i>1 ;i-- ) {
System.out.println(i);

if(a[a.length-i]>a[i-(a.length-(i-1))] ){ 
var = a[a.length-i];
a[a.length-i]=a[a.length-(i-1)];
a[a.length-(i-1)] = var;
}
	
}

return a;

}


/*static int[] copy(int[] a,int srcPos,int destPos, int[]b, int length){

	if(arcPos<0||desPos<0||length<0){


	}

	for (int i=0;i<(length-srcPos+1);i++ ) {
		b[destPos+i-1]=a[srcPos+i-1];
	}

return b;

}*/


static void print(int ...nums){
if (nums == null){

	System.out.println("error");
}else{

System.out.print("{");
for(int ele:nums)
System.out.print(""+ele+",");
}
System.out.print("}");

}

}