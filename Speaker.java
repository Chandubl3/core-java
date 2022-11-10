class Speaker{
	static String brand ;
	static String color ;
	static double price ;
	static boolean isConnected ;
	static int minVolume ;
	static int currentVolume ;
	static int maxVolume = 9;
	public static boolean onOrOff(){
		System.out.println("inside onOrOff");
		if(isConnected == false){
			isConnected = true ;
			System.out.println("Speaker turned On");
		}
		else if(isConnected == true){
			isConnected = false;
			System.out.println("Speaker turned Off");
		}
		System.out.println("end onOrOff");
		return isConnected;
		//System.out.println("end onOrOff"); is not a possible return statement is must be in end of the method, return statement can be many but it should be with in the condition
	}
	public static void increaseVolume(){
		if(isConnected == true){
			if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
				System.out.println("The currentVolume is " + currentVolume);
			}
			else {
				System.out.println("maxVolume is reached...!");
			}
		}
		else{
			System.out.println("Nayii.. 1st Speaker on madu");
		}
	}
	public static void decreaseVolume(){
		if(isConnected == true){
			if(currentVolume > minVolume){
				currentVolume = currentVolume -1;
				System.out.println("The volume is decrease " + currentVolume);
			}
			else{
				System.out.println("The volume is already decrease");
			}
		}
		else{
			System.out.println("1st true on the Speaker");
		}
	}
}