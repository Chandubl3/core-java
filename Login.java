class Login{
	public static void credentials(long contactNo,String name){
		System.out.println("Mobile No " +contactNo);
		System.out.println("Login in with name " +name);
	}
	public static void credentials(String name,long contactNo){
		System.out.println("Login in with name " +name);
		System.out.println("Mobile No " +contactNo);
	}
}