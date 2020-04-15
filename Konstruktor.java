class student{

private int years = 0;

public student(){

}

public student(int years){

this.years = years;
//System.out.print(years);
}


static void action(){
System.out.println("I can ");	
}


}


class banhua extends student{
	
}

class Konstruktor{

public static void main(String[] args) {
	
student leihaoran = new student();
student leihaoran2 = new student(88);
System.out.print(leihaoran2.years);
leihaoran.action();
leihaoran2.action();
}



}