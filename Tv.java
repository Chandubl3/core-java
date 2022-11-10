class Tv{
	static String brand ;
	static String color ;
	static double price ;
	static boolean on ;
	static int minVolume ;
	static int currentVolume ;
	static int maxVolume = 10;
	public static boolean onOrOff(){
		if(on == false){
			on = true ;
			System.out.println("Tv turned On");
		}
		else if(on == true){
			on = false;
			System.out.println("Tv turned Off");
		}
		return on;
	}
	public static void increaseVolume(){
		if(on == true){
			if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
				System.out.println("The currentVolume is " + currentVolume);
			}
			else {
				System.out.println("maxVolume is reached...!");
			}
		}
		else{
			System.out.println("on Tv");
		}
	}
	public static void decreaseVolume(){
		if(on == true){
			if(currentVolume > minVolume){
				currentVolume = currentVolume -1;
				System.out.println("The volume is decrease " + currentVolume);
			}
			else{
				System.out.println("The volume is already decrease");
			}
		}
		else{
			System.out.println("on Tv");
		}
	}
}