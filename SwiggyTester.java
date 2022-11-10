class SwiggyTester{
	public static void main(String arg[]){
		//String ref = swiggy.takeOrder("Cake");
	double total =	swiggy.takeOrder("Cake");
	System.out.println(total);
	double totalQuantity = swiggy.takeOrder("Cake",5);
	System.out.println(totalQuantity);
		//System.out.println("Ur Pastries Order is ready..!");
	}
}