class Bank{
	static String bankNames[] = {null,null,null,null,null};
	static int a;
	public static void addBankNames(String bankName){
		bankNames[a++] = bankName;
	}
	public static void getBankNames(){
		for(int a=0;a<bankNames.length;a++){
			System.out.println(bankNames[a]);
		}
	}
}