package Resturant_S;

import java.util.ArrayList;
import java.util.List;


public class Menu {
	private ArrayList<Product> menuItems = new ArrayList<Product>();


public Menu() {
	populateMenu();
}


public void populateMenu() {

	 menuItems.add(new Product("cheeseCakeCc", (float) 7.99, 50, 1));
	 menuItems.add(new Product("chocolateCheeseCakeCc", (float) 8.99, 40, 2));
	 menuItems.add(new Product("lemonCheeseCakeCc", (float) 8.99, 40, 3));
	 menuItems.add(new Product("strawberryCheeseCakeCc", (float) 8.99, 40, 4));
	 menuItems.add(new Product("oreoCheeseCakeCc", (float) 8.99, 40, 5));
}


private static void add(Product product) {
	// TODO Auto-generated method stub
	
}


public ArrayList<Product> getMenuItems(int i) {
	return menuItems;
}


public void setMenuItems(ArrayList<Product> menuItems) {
	this.menuItems = menuItems;
}
}
