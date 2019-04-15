package Resturant_S;

import java.util.ArrayList;

public class Product {
	    private String name;
	    private double price;
	    private int quantity;
	    private static int id = 1000;
	    private ArrayList<Product> menuItems = new ArrayList<Product>();
	    private ArrayList<Product> cartItems = new ArrayList<Product>();
		
	    public Product(String name, double price, int quantity,int id){
	        
	    }



		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(Float price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public static int getId() {
			return id;
		}
		public static void setId(int id) {
			Product.id = id;
		}
		public ArrayList<Product> getMenuItems() {
			return menuItems;
		}
		public void setMenuItems(ArrayList<Product> menuItems) {
			this.menuItems = menuItems;
		}
		public ArrayList<Product> getCartItems() {
			return cartItems;
		}
		public void setCartItems(ArrayList<Product> cartItems) {
			this.cartItems = cartItems;
		}
	    

}
