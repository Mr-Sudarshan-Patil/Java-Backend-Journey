package com.ecommers;

public class ProductClass {
   String productName;
   int price; 
   String description;
   int quantity;
   
   //Default Constructor
   ProductClass()
   {
	
   }
   
   //Param Constructor with : product name, price, description, quantity
   ProductClass(String $productName, int $price, String $description, int $quantity){
	   this.productName = $productName;
	   this.price = $price;
	   this.description = $description;
	   this.quantity = $quantity;
   }
  
   //Param Constructor with: product name and description
   ProductClass(String $productName, String $description){
	   this.productName = $productName;
	   this.description = $description;
   }
   
   //this method print all parameter
   void printProductDetails() {
	   System.out.println("=====");
	   System.out.println("Product Name: " + productName);
	   System.out.println("Product Price: " + price);
	   System.out.println("Product Description: " + description);
	   System.out.println("Quantity: " + quantity);
	   System.out.println("=====");
   }
   
   //this method only print product and description
   void printProduct() {
	   System.out.println("=====");
	   System.out.println("Product Name: " + productName);
	   System.out.println("Product Description: " + description);
	   System.out.println("=====");
   }
   
}
