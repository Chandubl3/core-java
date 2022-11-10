class SpeakerTester{
	public static void main(String arg[]){
		Speaker.brand = "boat";
		Speaker.color = "navyblue";
		Speaker.price = 3000.00;
		Speaker.onOrOff();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.onOrOff();
		Speaker.increaseVolume();
		Speaker.onOrOff();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.onOrOff();
		System.out.println(Speaker.brand);
		System.out.println(Speaker.color);
		System.out.println(Speaker.price);
	}
}