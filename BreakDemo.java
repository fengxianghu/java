class BreakDemo{
public static void main(String[] args) {



 //System.out.println("\n");

outter:for(int line =1;line<=9;line++){
for(int i = 1;i<=line;i++ ){

	if(line==5){
		break outter;
	} 

  System.out.print(1+"*"+i+"="+(i*1)+"\t");

}
System.out.print("\n");
}




}
}