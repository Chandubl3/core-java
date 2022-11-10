class Trimmer{
	public static void main(String arg[]){
		String color = "Black";
		String brand = "Philips";
		int price = 849;
		String working = "Soft";
		String warranty = "2years";
		String totalSetting[] = {"on","off"};
		System.out.println(color);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(working);
		System.out.println(warranty);
		for(int s = 0;s<totalSetting.length;s++){
			System.out.println(totalSetting[s]);
		}
	}
}