class MobileDetails {

    String brand;
    int price;

    static String network = "5G";

    public static void main(String[] args) {

        MobileDetails m1 = new MobileDetails();
        m1.brand = "Samsung";
        m1.price = 30000;
        m1.displayMobile();

		System.out.println("=======================");
		
        MobileDetails m2 = new MobileDetails();
        m2.brand = "OnePlus";
        m2.price = 35000;
        m2.displayMobile();

        MobileDetails.displayNetwork();
    }
	
	    void displayMobile() {
        int discount = 1000;

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
    }

    static void displayNetwork() {
        System.out.println("Network: " + network);
    }

}