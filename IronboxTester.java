class IronboxTester{
	public static void main(String arg[]){
		Ironbox.brand = "Philips";
		Ironbox.color = "blue";
		Ironbox.price = 2399.00;
		System.out.println(Ironbox.brand);
		System.out.println(Ironbox.color);
		System.out.println(Ironbox.price);
		Ironbox.heated();
		Ironbox.increaseVolume();
		Ironbox.decreaseVolume();
		Ironbox.increaseVolume();
		Ironbox.heated();
		Ironbox.decreaseVolume();
	}
}