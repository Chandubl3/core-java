class swiggy{
	public static double takeOrder(String item){
		//String item = "Pastries";
		if(item == "Pizza"){
			System.out.println("Thankyou for Ording " +item);
			return 99.00;
		}
		if(item == "Passta"){
			System.out.println("Thankyou for Ording " +item);
			return 120.00;
		}
		if(item == "Sandwitch"){
			System.out.println("Thankyou for Ording " +item);
			return 45.00;
		}
		if(item == "Frenchfrices"){
			System.out.println("Thankyou for Ording " +item);
			return 40.00;
		}
		if(item == "Pastries"){
			System.out.println("Thankyou for Ording " +item);
			return 50.00;
		}
		if(item == "burger"){
			System.out.println("Thankyou for Ording " +item);
			return 69.00;
		}
		if(item == "Cake"){
			System.out.println("Thankyou for Ording " +item);
			return 25.00;
		}
		return 0.0;
	}
	public static double takeOrder(String item,int quantity){
		if(item == "Pizza"){
			System.out.println(item);
			System.out.println(quantity);
			return 99.00*quantity;
		}
		if(item == "Passta"){
			System.out.println(item);
			System.out.println(quantity);
			return 120.00*quantity;
		}
		if(item == "Sandwitch"){
			System.out.println(item);
			System.out.println(quantity);
			return 45.00*quantity;
		}
		if(item == "Frenchfrices"){
			System.out.println(item);
			System.out.println(quantity);
			return 40.00*quantity;
		}
		if(item == "Pastries"){
			System.out.println(item);
			System.out.println(quantity);
			return 50.00*quantity;
		}
		if(item == "burger"){
			System.out.println(item);
			System.out.println(quantity);
			return 69.00*quantity;
		}
		if(item == "Cake"){
			System.out.println(item);
			System.out.println(quantity);
			return 25.00*quantity;
		}
		return 0.0;
	}
}