class CitizenOfIndia{
	public static void responsibility(int age, char gender){
		if(age < = 10){
			System.out.println("School");
			//return ;
		}
		if(age > = 10 && age == 21){
			System.out.println("College");
			//return ;
		}
		if(age > = 18){
			System.out.println("Voting");
			if(age > 21){
				System.out.println("Marriage");
			}
		}
	} 
}