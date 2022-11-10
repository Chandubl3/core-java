class EmpireRestaurant{
	public static void main(String a[]){
		String address = "Rajajinagar";
		String reviews = "4.1Stars";
		String menu[] = {"Juices","Icecreams","Rotis","Dosa & Appam"};
		String juices[] = {"WaterMelon Rs.70","Orange Rs.60","Mango Rs.85","PulpyGrape Rs.90","RichAnae Rs.125","Pineapple Rs.70","Lemon Rs.50"};
		String icecreams[] = {"Vanilla Rs.60","Chocolate Rs.60","strawberry Rs.60","pista Rs.60"};
		String rotis[] = {"BtterKulcha Rs.40","ButterNaan Rs.40","ButterRoti Rs.33","Kulcha Rs.32","RomaliRoti Rs.22","TandooriNaan Rs.32","Tandooriroti Rs.27"};
		String dosa[] = {"ChickenKheemaDosa Rs.125","DosaChicken Rs.140","EggDosaChicken Rs.150","EggDosaVeg Rs.60","MuttonKheemaDosa Rs.160","OnionDosa Rs.35","OnionDosaChicken Rs.150","PlainDosa Rs.30","VegDosaWithVegKurma Rs.120"};
		System.out.println("Welcome to Empire Restaurant");
		System.out.println(address);
		System.out.println(reviews);
		System.out.println("Menu");
		System.out.println("Juices");
		for(int j=0;j<juices.length;j++){
			System.out.println(juices[j]);
		}
		System.out.println("Icecreams");
		for(int i=0;i<icecreams.length;i++){
			System.out.println(icecreams[i]);
		}
		System.out.println("Rotis");
		for(int r=0;r<roti.length;r++){
			System.out.println(rotis[r]);
		}
		System.out.println("Dosa & Appam");
		for(int d=0;d<dosa.length;d++){
			System.out.println(dosa[d]);
		}
	}
}