class VivantaTajHotel{
	public static void main(String a[]){
		String type = "5 star Hotel";
		String address = "Yeshwanthpuram" ;
		String[] managerNames = {"varun","sangeeta","kavya","sanju"};
		int noOfManager = 4;
		String foodMenu[] = {"panipuri","masalpuri","belpuri","sevpuri","pavbajji","padapav","chipsmasala","chirmuri","sandwitch","pizza","burger","geerice","jeerarice","friderice","samosa","samosamasala"};
		System.out.println("welcome to VivantaTajHotel");
		System.out.println("Address = " +address);
		System.out.println("Type = "+type);
		System.out.println("Food Menu");
		for(int z=0;z<foodMenu.length;z++){
			System.out.println("Menu" +z+ " " +foodMenu[z]);
		}
		System.out.println("Managers = " +noOfManager);
		System.out.println("Managers Names");
		for(int s=0;s<managerNames.length;s++){
			System.out.println(managerNames[s]);
		}
	}
}