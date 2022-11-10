class SuperMarket{
	static String superMarketName;
	//static String vegatables[];
//	= {"carrot","tomoto","onion","pumkin","beens"};
	static String deos[] = {"woww","whatagirl","fog","axe","ks","screte"};
	public static void main(String a[]){
		superMarketName = "YaaMart" ;
		String vegatables[] = {"carrot","tomoto","onion","pumkin","beens"};
		String fruits[] = {"apple","mango","papaya","orange","kewi"};
		String biscuits[] = {"parle","oreo","sunfeast","goode","momsmagic"};
		String chocolates[] = {"dairymilk","milkybar","kitket","munch","park"};
		String groceries[] = {"rice","wheat","grams","mustard","cumin"};
		String coloths[] = {"longtop","jeanstop","jeanspant","leggin","jumpsuit"};
		String shoes[] = {"bata","catwalk","crocs","h&m","liberty"};
		String cosmetics[] = {"kajal","matelipstick","sunscreencream","nightcream","compact","eyeliner","maskara"};
		String lays[] = {"cheddar jalapeno","classic potato","flavored potato","cream&onion","salt&vinegar"};
		System.out.println("Welcome to " + superMarketName);
		System.out.println("Deos");
		System.out.println( deos[0]+" "+deos[1]+" "+deos[2]+" "+deos[3]+" "+deos[4]+" "+deos[5]);
		System.out.println("Biscuits");
		System.out.println( biscuits[0]+" "+biscuits[1]+" "+biscuits[2]+" "+biscuits[3]+" "+biscuits[4]);
		System.out.println("Chocolates");
		System.out.println( chocolates[0]+" "+chocolates[1]+" "+chocolates[2]+" "+chocolates[3]+" "+chocolates[4]);
		System.out.println("Groceries");
		System.out.println( groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[4]);
		System.out.println("Coloths");
		System.out.println( coloths[0]+" "+coloths[1]+" "+coloths[2]+" "+coloths[3]+" "+coloths[4]);
		System.out.println("Shoes");
		System.out.println( shoes[0]+" "+shoes[1]+" "+shoes[2]+" "+shoes[3]+" "+shoes[4]);
		System.out.println("Lays");
		System.out.println( lays[0]+" "+lays[1]+" "+lays[2]+" "+lays[3]+" "+lays[4]);
		System.out.println("cosmetics are");
		// length is property of array
		// length r size -1
		for(int c = 0;c < cosmetics.length;c++){
			System.out.println(cosmetics[c] + "");
			}
			//or
		System.out.println("Vegatables are");
		for(int v =0;v <= vegatables.length-1;v++){
			System.out.println(vegatables[v] + "");
			}
		System.out.println("Fruits are");
		for(int f = 1;f < fruits.length;f++){
			System.out.println(fruits[f]+ "");
		}
	}


}