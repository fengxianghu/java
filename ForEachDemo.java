class ForEachDemo{
public static void main(String[] args) {
	
int[] a = new int[]{1,2,3,4,5};
for(int ele:a){
	System.out.println(ele);
}

System.out.println(ForEachDemo.getSum(1,2,3,4,5));

}

/*static double getSum(double[] nums){
double sum = 0;

for(double ele:nums){
sum+=ele;


}

return sum;
}
*/


static double getSum(double ...nums){
double sum = 0;

for(double ele:nums){
sum+=ele;


}

return sum;
}

}
