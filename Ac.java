class Ac{
	//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
	static String brand;
	static String color;
	static double price;
	static boolean sswitch ;
	static int minVolume;
	static int currentVolume;
	static int maxVolume = 5;
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
	public static void increaseVolume(){
		if(sswitch == true){
			if(currentVolume < maxVolume){
				currentVolume = currentVolume+1;
				System.out.println("The currentVolume is "+currentVolume);
			}
			else{
				System.out.println("Maxvolume is reached");
			}
		}
		else{
			System.out.println("true on the ac");
		}
	}
	public static void decreaseVolume(){
		if(sswitch == true){
			if(currentVolume > minVolume){
				currentVolume = currentVolume-1;
				System.out.println("The currentVolume is "+currentVolume);
			}
			else{
				System.out.println("Minvolume is reached");
			}
		}
		else{
			System.out.println("true on the ac");
		}
	}
}