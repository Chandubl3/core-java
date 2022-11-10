class IcecreamTester{
	//JVM is looking for main method for run the code, JVM is in JRE.
	public static void main(String arg[]){
		Icecream.icecreamName = "Butterscotch";
		Icecream.type = "cone";
		Icecream.icecreamBrand = "Arun";
		Icecream.icecreamColor = "creamy";
		Icecream.price = 50.00;
		System.out.println(Icecream.icecreamName);
		System.out.println(Icecream.type);
		System.out.println(Icecream.icecreamBrand);
		System.out.println(Icecream.icecreamColor);
		System.out.println(Icecream.price);
	}
}