package Resturant_S;

import java.util.ArrayList;

public class cart {
	private ArrayList<Product> cartItems = new ArrayList<Product>();

	public cart() {
		populatecart();
		removecart();
		updatecart();
	}
	
	private void updatecart() {
		for (int i = 0; i <  cartItems.size(); i++)
			 cart.update(new Product("cheeseCakeCc", (float) 7.99, 50, 1));
			 cart.update(new Product("chocolateCheeseCakeCc", (float) 8.99, 40, 2));
			 cart.update(new Product("lemonCheeseCakeCc", (float) 8.99, 40, 3));
			 cart.update(new Product("strawberryCheeseCakeCc", (float) 8.99, 40, 4));
			 cart.update(new Product("oreoCheeseCakeCc", (float) 8.99, 40, 5));
		
	}
	
	
	private void removecart() {
		for (int i = 0; i <  cartItems.size(); i++)
			 cart.remove(new Product("cheeseCakeCc", (float) 7.99, 50, 1));
			 cart.remove(new Product("chocolateCheeseCakeCc", (float) 8.99, 40, 2));
			 cart.remove(new Product("lemonCheeseCakeCc", (float) 8.99, 40, 3));
			 cart.remove(new Product("strawberryCheeseCakeCc", (float) 8.99, 40, 4));
			 cart.remove(new Product("oreoCheeseCakeCc", (float) 8.99, 40, 5));
		
	}


	private void populatecart() {
		for (int i = 0; i <  cartItems.size(); i++)
		 cart.add(new Product("cheeseCakeCc", (float) 7.99, 50, 1));
		 cart.add(new Product("chocolateCheeseCakeCc", (float) 8.99, 40, 2));
		 cart.add(new Product("lemonCheeseCakeCc", (float) 8.99, 40, 3));
		 cart.add(new Product("strawberryCheeseCakeCc", (float) 8.99, 40, 4));
		 cart.add(new Product("oreoCheeseCakeCc", (float) 8.99, 40, 5));
	}


	private static void add(Product product) {
		// TODO Auto-generated method stub
		
	}
	
	private static void remove(Product product) {
		
	} 
	
	private static void update(Product product) {
		
	}
		

		public ArrayList<Product> getCartItems() {
			return cartItems;
		}

		public void setCartItems(ArrayList<Product> cartItems) {
				this.cartItems = cartItems;
		}
}
