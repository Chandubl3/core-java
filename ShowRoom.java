class ShowRoom{
	public static void getCars(String[] cars){
		System.out.println("Cars are");
		System.out.println("List of Cars is "+cars.length);
		for(int a = 0; a < cars.length; a++){
			System.out.println(cars[a]);
		}
	} 
	public static void getBikes(String[] bikes){
		System.out.println("Bikes are");
		System.out.println("List of Bikes is "+bikes.length);
		for(int a = 0; a < bikes.length; a++){
			System.out.println(bikes[a]);
		}
	}
}