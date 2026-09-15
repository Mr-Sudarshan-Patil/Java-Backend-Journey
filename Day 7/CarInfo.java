class CarInfo {

    String brand;
    int price;

    static String country = "India";

    public static void main(String[] args) {

   
		CarInfo car1 = new CarInfo();
        car1.brand = "Toyota";
        car1.price = 1000000;
        car1.displayCar();
		
        CarInfo car2 = new CarInfo();
        car2.brand = "Honda";
        car2.price = 900000;
        car2.displayCar();


        CarInfo.displayCountry();
    }
	
	static void displayCountry() 
	{
        System.out.println("Country: " + country);
    }
	
	void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

}