class Addition{
	//main method
	public static void main(String a[]){
		System.out.println("Add");
		//calling a method it should be in main method
		//invoking a add method
		add(34,56);//arguments
		add(87,90);
		System.out.println("Div");
		//calling a method
		div(42,2);
		div(9,3);
		div(78,4);
		System.out.println("Sub");
		sub(87,54);
		sub(34,27);
		System.out.println("Mul");
		mul(56,4);
		mul(34,22);
	}
	//own method
	//method declration
	//method: are collection of statements that are combined/grouped together to perform any operation/funcatonallity
	public static void add(int a, int b){ // method header
	//add(int a, int b)is called as method signicificate
		System.out.println(a+b);//body of the method
	}
	//own method
	public static void div(int a, int b){
		System.out.println(a/b);
	}
	public static void sub(int a, int b){
		System.out.println(a-b);
	}
	public static void mul(int a, int b){
		System.out.println(a*b);
	}
}