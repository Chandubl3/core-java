class TvTester{
	public static void main(String arg[]){
		Tv.brand = "Whirlpool";
		Tv.color = "black";
		Tv.price = 28449.00;
		Tv.onOrOff();
		Tv.increaseVolume();
		Tv.increaseVolume();
		Tv.increaseVolume();
		Tv.increaseVolume();
		Tv.onOrOff();
		Tv.increaseVolume();
		Tv.onOrOff();
		Tv.decreaseVolume();
		Tv.decreaseVolume();
		Tv.decreaseVolume();
		Tv.onOrOff();
		System.out.println(Tv.brand);
		System.out.println(Tv.color);
		System.out.println(Tv.price);
	}
}