class Beaches{
	static String beachNames[] = {null,null,null,null,null};
	static int index;
	public static boolean addBeachNames(String beachName){
		if(beachNames.length<=5 && beachName!= null && beachName!= ""){//validation we use frontend and backend also
			beachNames[index] = beachName;
			index++;
		}
		else if(beachNames.length<=5 && beachName!= null && beachName!= ""){
			System.out.println("Already BeachNames are Stored");
		}
		return false;
	}
	public static void getBeachNames(boolean value){
		if(value == true){
			for(int index = 0; index<beachNames.length; index++){
				String ref = beachNames[index];
				System.out.println("Beach Name = " +ref);
			}
		}
		else 
		if(value == false){
		System.out.println("No BeachNames");
		}
	}
	/*public static void findBeachName(String beachName){
		if(beachName == Gokarna){
			for(int index = 0; index<beachNames.length; index++){
				String ref = beachNames[index];
				System.out.println("Beach Name = " +ref);
			}
		}
		else 
		if(value == false){
		System.out.println("No BeachNames");
		}
	}*/
	public static boolean updateBeachNames(String newBeachName, String oldBeachName){
		if(newBeachName != null && oldBeachName != null){
			for(int index = 0; index<beachNames.length; index++){
				if(beachNames[index] == oldBeachName){
					System.out.println("oldBeachName is "+beachNames[index]);
					beachNames[index] = newBeachName;
					System.out.println("newBeachName is "+beachNames[index]);	
					return true;
				}
			}
		}
		return false;
	}
	public static boolean updateBeachNames(String newBeachName, int existingIndex){
		for(int index = 0; index<beachNames.length; index++){
			if(index == existingIndex){
				beachNames[index] = newBeachName;
				System.out.println("newBeachName is "+beachNames[index]);	
				return true;
			}
		}
		return false;
	}
}	