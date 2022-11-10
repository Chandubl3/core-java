class Forest{
	public static void main(String arg[]){
		String name = "Bandipur National Park";
		String totalArea = "874 km²";
		String location = "Karnataka";
		//String region = "";
		String animals[] = {"Lion","Tiger","Deer","Elephants","Wolves"};
		System.out.println(name);
		System.out.println(totalArea);
		System.out.println(location);
		for(int a=0;a<animals.length;a++){
			System.out.println(animals[a]);
		}
	}
}