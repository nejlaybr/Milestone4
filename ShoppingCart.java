package storefront;

import java.util.ArrayList;

/**
 * Stores products selected by the user.
 * Allows products to be added and displayed.
 *
 * @author Nejla Yber
 */

public class ShoppingCart 
{
    private ArrayList<SalableProduct> cart;

    /**
     * Creates an empty shopping cart.
     */
    
    // Constructor
    public ShoppingCart()
    {
        cart = new ArrayList<>();
    }

    /**
     * Adds a product to the shopping cart.
     *
     * @param product Product to add
     */
    
    public void addProduct(SalableProduct product)
    {
        cart.add(product);
        System.out.println(product.getName() + " added to cart.");
    }
    
    /**
     * Displays all products in the shopping cart.
     */
    
 // Show cart
    public void showCart()
    {
        System.out.println("Shopping Cart:");

        for(SalableProduct product : cart)
        {
            product.displayProduct();
        }
    }

    public void removeProduct(SalableProduct product)
    {
        cart.remove(product);
    }

    public ArrayList<SalableProduct> getProducts()
    {
        return cart;
    }

    public void emptyCart()
    {
        cart.clear();
 
       
    }
}