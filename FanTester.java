class FanTester{
	public static void main(String arg[]){
		Fan.brand="Bajaj";
		Fan.color="Brown";
		Fan.price=14999.00;
		System.out.println(Fan.brand);
		System.out.println(Fan.color);
		System.out.println(Fan.price);
		Fan.onOff();
		Fan.increaseVolume();
		Fan.increaseVolume();
		Fan.decreaseVolume();
		Fan.increaseVolume();
		Fan.onOff();
		Fan.increaseVolume();
		Fan.onOff();
		Fan.decreaseVolume();
		Fan.onOff();
		Fan.decreaseVolume();
	}
}