class BigbazaarTester{
	public static void main(String arg[]){
		Bigbazaar bb = new Bigbazaar();
		bb.name = "Vijayanagara";
		bb.noOfManager = 5;
		bb.noOfWorkers = 28;
		bb.item = 129;
		bb.ratings = 3.5;
		System.out.println("Bigbazaar in "+bb.name+" Managers "+bb.noOfManager+" Workers "+bb.noOfWorkers+" Item "+bb.item+" Ratings "+bb.ratings);
		bb.name = "Jayanagara";
		bb.noOfManager = 7;
		bb.noOfWorkers = 35;
		bb.item = 137;
		bb.ratings = 3.9;
		Bigbazaar big = bb;
		System.out.println("Bigbazaar in "+big.name+" "+big.noOfManager+" "+big.noOfWorkers+" "+big.item+" "+big.ratings);
	}
}