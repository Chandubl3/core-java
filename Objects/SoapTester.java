class SoapTester{
	public static void main(String arg[]){
		Soap soap = new Soap();
		soap.soapName = "Mysore Sandal";
		soap.shape = "Ovel";
		soap.color = "Gold";
		soap.price = 42.00;
		Soap.toGetReady();
		//System.out.println("Soap "+" "+soap.soapName+" "+soap.shape+" "+soap.color+" "+soap.price);
		Soap soap = new Soap();
		soap.soapName = "Lux";
		soap.shape = "Rectangle";
		soap.color = "Pink";
		soap.price = 38.00;
		Soap.toGetReady();
		//System.out.println("Soap "+" "+soap1.soapName+" "+soap1.shape+" "+soap1.color+" "+soap1.price);
		Soap soap2 = new Soap();
		soap2.soapName = "Dove";
		soap2.shape = "Cricle";
		soap2.color = "White";
		soap2.price = 52.00;
		Soap.toGetReady();
		//System.out.println("Soap "+" "+soap2.soapName+" "+soap2.shape+" "+soap2.color+" "+soap2.price);
		Soap soap3 = new Soap();
		soap3.soapName = "LifeBuoy";
		soap3.shape = "Rectangle";
		soap3.color = "Red";
		soap3.price = 36.00;
		Soap.toGetReady();
		//System.out.println("Soap "+" "+soap3.soapName+" "+soap3.shape+" "+soap3.color+" "+soap3.price);
		Soap soap4 = new Soap();
		soap4.soapName = "Medimix";
		soap4.shape = "Rectangle";
		soap4.color = "Green";
		soap4.price = 30.00;
		Soap.toGetReady();
		//System.out.println("Soap "+" "+soap4.soapName+" "+soap4.shape+" "+soap4.color+" "+soap4.price);
		//constructor is a special type of method which will be same name as class name along with () with no returntype.
	}
}