class Sswitch{
	static String company;
	static String color;
	static double price;
	static boolean sswitch ;
	public static boolean onOff(){
		if(sswitch == false){
			sswitch = true;
			System.out.println("Switch on");
		}
		else if(sswitch == true){
			sswitch = false;
			System.out.println("Switch off");
		}
		return sswitch;
	}
}