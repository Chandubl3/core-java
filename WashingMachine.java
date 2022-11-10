class WashingMachine{
	static String brand ;
	static String color ;
	static String type ;
	static double price ;
	static boolean washing ;
	static int minVolume ;
	static int currentVolume ;
	static int maxVolume = 4;
	public static boolean onOrOff(){
		if (washing == false){
			washing = true;
			System.out.println("washing is started");
		}
		else if(washing == true){
			washing = false;
			System.out.println("washing is not started");
		}
		return washing;
	}
	public static void increaseVolume(){
		if(washing == true){
			if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
				System.out.println("The currentVolume is " +currentVolume);
			}
			else{
				System.out.println("maxVolume is reached");
			}
		}
		else{
			System.out.println("Plz turn on the machine");
		}
	}
	public static void decreaseVolume(){
		if(washing == true){
			if(currentVolume > minVolume){
				currentVolume = currentVolume - 1;
				System.out.println("The currentVolume is " +currentVolume);
			}
			else{
				System.out.println("minVolume is reached");
			}
		}
		else{
			System.out.println("Plz turn on the machine");
		}
	}
}