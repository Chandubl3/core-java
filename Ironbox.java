class Ironbox{
	static String brand ;
	static String color ;
	static double price ;
	static boolean ironbox ;
	static int minVolume ;
	static int currentVolume ;
	static int maxVolume = 3;
	public static boolean heated(){
		if(ironbox == false){
			ironbox = true;
			System.out.println("Heated");
		}
		else if(ironbox == true){
			ironbox = false;
			System.out.println("not heated");
		}
		return ironbox;
		//the return value must and should have the same datatype as in return type
	}
	public static void increaseVolume(){
		if(ironbox == true){
			if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
				System.out.println("The currentVolume is " +currentVolume);
			}
			else{
				System.out.println("maxVolume is reached");
			}
		}
		else{
			System.out.println("Plz turn on the switch");
		}
	}
	public static void decreaseVolume(){
		if(ironbox == true){
			if(currentVolume > minVolume){
				currentVolume = currentVolume - 1;
				System.out.println("The currentVolume is " +currentVolume);
			}
			else{
				System.out.println("minVolume is reached");
			}
		}
		else{
			System.out.println("Plz turn on the switch");
		}
	}
}