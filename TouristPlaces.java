class TouristPlaces{
	static String touristPlaces[] = {null,null,null,null,null};
	static int i;
	public static void saveTouristPlaces(String touristPlace){
		touristPlaces[i++] = touristPlace;
	}
	public static void getTouristPlaces(){
		for(int i=0;i<touristPlaces.length;i++){
			System.out.println(touristPlaces[i]);
		}
	}
}