package storefront;

import java.util.Scanner;

/**
 * Main Store Front application for the Fantasy Game Store.
 * Allows users to view products, purchase products,
 * view the shopping cart, return products, and exit.
 *
 * @author Nejla Yber
 */

public class StoreFront 
{
	/**
     * Starts the Fantasy Game Store application.
     *
     * @param args Command-line arguments
     */
	
    public static void main(String[] args) 
    {
    	  FileService fileService = new FileService();

    	    try {
    	        fileService.loadInventory("inventory.json");
    	    }
    	    catch (InventoryException e) {
    	        System.out.println(e.getMessage());
    	    }
    	    Scanner scanner = new Scanner(System.in);

    	    InventoryManager inventory = new InventoryManager();
    	    ShoppingCart cart = new ShoppingCart();

    	    // Welcome Message
    	    System.out.println("Welcome to the Fantasy Game Store!");
    	    System.out.println("Purchase weapons, armor, and health items.");
    	    System.out.println();

    	    int choice = 0;	

        while(choice != 5)
        {
        	System.out.println("==== GAME STORE ====");
        	System.out.println("1. View Products");
        	System.out.println("2. Buy Product");
        	System.out.println("3. View Cart");
        	System.out.println("4. Return Product");
        	System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    inventory.showProducts();
                    break;

                case 2:
                    inventory.showProducts();

                    System.out.print("Choose product number: ");
                    int productNumber = scanner.nextInt();

                    if(productNumber > 0 && productNumber <= inventory.getSize())
                    {
                    	SalableProduct product =
                    	        inventory.getProduct(productNumber - 1);

                    	cart.addProduct(product);
                    	inventory.removeProduct(product);
                    }
                    else
                    {
                    	System.out.println("Return Product feature coming next.");
                    }

                    break;

                case 3:
                    cart.showCart();
                    break;

                case 4:

                    if(cart.getProducts().size() > 0)
                    {
                        SalableProduct product = cart.getProducts().get(0);

                        cart.removeProduct(product);
                        inventory.addProduct(product);

                        System.out.println(product.getName()
                                + " returned to inventory.");
                    }
                    else
                    {
                        System.out.println("Cart is empty.");
                    }

                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}