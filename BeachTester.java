class BeachTester{
	public static void main(String arg[]){
		Beaches.addBeachNames("Malape");
		Beaches.addBeachNames("Gokarna");
		Beaches.addBeachNames("Murudeshwara");
		Beaches.addBeachNames("Marina");
		Beaches.addBeachNames("Baga");
		Beaches.getBeachNames(true);
		//Beaches.getBeachNames(false);
		Beaches.updateBeachNames("Parides" , "Marina");
		Beaches.getBeachNames(true);
		//Beaches.getBeachNames(false);
		Beaches.updateBeachNames("Om" , 4);
		Beaches.getBeachNames(true);
		//Beaches.getBeachNames(false);
	}
}