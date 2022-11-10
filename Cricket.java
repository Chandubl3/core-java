class Cricket{
	public static void main(String cricket[]){
		int rohitHs = 264;
		int sachinHs = 200;
		int madanaHs = 232;
		int ackarrHs = 222;
		int bjHs = 229;
		int highestScore[] = {rohitHs,sachinHs,madanaHs,ackarrHs,bjHs};
		int ref3 = highestScore[3];
		int ref1 = highestScore[1];
		int ref0 = highestScore[0];
		System.out.println("Element at index 3 "+ ref3);
		System.out.println("Element at index 1 "+ ref1);
		System.out.println("Element at index 0 "+ ref0);
		//length is a property of array
		System.out.println("The length of highestScore = "+highestScore.length);
		for(int index = 0;index<highestScore.length;index++){
			System.out.println(highestScore[index]);
		}
	}
}