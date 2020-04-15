class arrayDemo1{


	public static void main(String[] args) {
		
		int[] a =new int[]{1,2,3,10,5};
		int max = a[0];
	    int min = a[0];
	    int var = a[0];


		for (int i=0;i<a.length ;i++ ) {
			var = a[i];

			if(var<=max){
            if(var>=min){

            	continue;
            }else{

            	min = var; 
            }


			}else{

			max=var;
			}	
			
		}

System.out.println(max);
System.out.println(min);


	}
}