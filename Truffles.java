class Truffles{
	public static void main(String a[]){
		String address = "Koramangala";
		String menu[] = {"Wood Fired Pizza","Draught Coffee","All Juiced Up"};
		String pizza[] = {"Margarita","Pepper & SweetCorn","Sundried Tomato","Cheese","Thai Basil Mushroom","Paneer Tikka","BBQ Chicken","Thai Basil Chicken","Chicken Tikka","Chicken Pahadi","Chicken Ham","Salam","Sausage","Kheema & Egg","Smoked Lamd & Buttered Sausage","Prawn"};
		String coffee[] = {"Irish Cream","Hazelnut","English Toffee","Cinnamon"};
		String allJuicedUp[] = {"Shakes","Bombay Falooda","Lemonade","Iced Tea","European Hot Chocolate","Yoghurt Smoothies","Coolers","Mojitos"};
		String shakes[] = {"Phirni","English toffee"};
		String lemonade[] = {"Blackberry","lemongrass"};
		String icedtea = "Very Berry";
		String european[] = {"Hazelnut","Irish","Cinnamon"};
		String yoghurt[] = {"mango","Strawberry"};
		String coolers[] = {"Guava Chill","Kaala Jamun"};
		String mojitos[] = {"Watermelon Mojito","Classic Mojito"};
		System.out.println("Welcome to Truffles");
		System.out.println(address);
		System.out.println("Menu");
		for(int m=0;m<menu.length;m++){
			System.out.println(menu[m]);
		}
		System.out.println("Wood Fired Pizza");
		for(int p=0;p<pizza.length;p++){
			System.out.println(pizza[p]);
		}
		System.out.println("Draught Coffee");
		for(int c=0;c<coffee.length;c++){
			System.out.println(coffee[c]);
		}
		System.out.println("All Juiced Up");
		for(int u=0;u<allJuicedUp.length;u++){
			System.out.println(allJuicedUp[u]);
		}
		System.out.println("Shakes");
		for(int s=0;s<shakes.length;s++){
			System.out.println(shakes[s]);
		}
		System.out.println("Lemonade");
		for(int l=0;l<lemonade.length;l++){
			System.out.println(lemonade[l]);
		}
		System.out.println("Iced Tea");
		System.out.println("European Hot Chocolate");
		for(int e=0;e<european.length;e++){
			System.out.println(european[e]);
		}
		System.out.println("Yoghurt Smoothies");
		for(int y=0;y<yoghurt.length;y++){
			System.out.println(yoghurt[y]);
		}
		System.out.println("Coolers");
		for(int o=0;o<coolers.length;o++){
			System.out.println(coolers[o]);
		}
		System.out.println("Mojitos");
		for(int j=0;j<mojitos.length;j++){
			System.out.println(mojitos[j]);
		}
	}
}