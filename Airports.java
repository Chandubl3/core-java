class Airports{
	static String airports[] = {null,null,null,null,null};
	static int s;
	public static void listOfAirports(String airport){
		airports[s++] = airport;
	}
	public static void getAirportNames(){
		for(int s=0;s<airports.length;s++){
			System.out.println(airports[s]);
		}
	}
}