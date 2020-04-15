
class dog{
int num = 0;
String name  = "大傻";



public void action(String name){

this.name = name;
System.out.println("这只狗叫:"+name);

}


}

class zhonghuatianyuanquan extends dog{


}

class thisDemo{

	public static void main(String[] args){

		dog idiot  = new dog();
		zhonghuatianyuanquan stupid  = new zhonghuatianyuanquan(); 
		idiot.action("旺财");
		stupid.action("来福");
	}

}