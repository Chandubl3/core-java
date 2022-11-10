class AcTester{
	public static void main(String arg[]){
		Ac.brand="Blue star";
		Ac.color="white";
		Ac.price=30000.00;
		System.out.println(Ac.brand);
		System.out.println(Ac.color);
		System.out.println(Ac.price);
		Ac.onOff();
		Ac.increaseVolume();
		Ac.increaseVolume();
		Ac.decreaseVolume();
		Ac.increaseVolume();
		Ac.onOff();
		Ac.increaseVolume();
		Ac.onOff();
		Ac.decreaseVolume();
		Ac.onOff();
		Ac.decreaseVolume();
	}
}