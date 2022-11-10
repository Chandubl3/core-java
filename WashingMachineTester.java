class WashingMachineTester{
	public static void main(String arg[]){
		WashingMachine.brand = "Pigeon";
		WashingMachine.color = "Silver";
		WashingMachine.type = "Frontdoor";
		WashingMachine.price = 24999.00;
		System.out.println(WashingMachine.brand);
		System.out.println(WashingMachine.color);
		System.out.println(WashingMachine.type);
		System.out.println(WashingMachine.price);
		WashingMachine.onOrOff();
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.decreaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.onOrOff();
		WashingMachine.decreaseVolume();
		WashingMachine.onOrOff();
		WashingMachine.increaseVolume();
	}
}