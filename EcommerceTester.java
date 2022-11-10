class EcommerceTester{
	public static void main(String arg[]){
		Ecommerce.setJewellery("Earings");
		Ecommerce.setClothes("Jeans");
		Ecommerce.setElectronicdevices("Phone");
		Ecommerce.setBlankets("...");
		System.out.println(getJewellery()+ " " +getClothes()+ " " +getElectronicdevices()+ " " +getBlankets());
	}
}