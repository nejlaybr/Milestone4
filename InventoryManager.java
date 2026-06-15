package storefront;

import java.util.ArrayList;

/**
 * Manages the inventory of products available in the store.
 * Stores and displays products for purchase.
 *
 * @author Nejla Yber
 */

public class InventoryManager
{
    private ArrayList<SalableProduct> products;
    
    /**
     * Creates the inventory and loads default products.
     */

    public InventoryManager()
    {
        products = new ArrayList<>();

        products.add(new Weapon("Sword", "Sharp steel sword",
                50.0, 5, 25, "Melee"));

        products.add(new Weapon("Bow", "Long range weapon",
                45.0, 4, 20, "Ranged"));

        products.add(new Armor("Shield", "Strong defensive shield",
                40.0, 3, 15, "Wood"));

        products.add(new Armor("Iron Armor", "Heavy body armor",
                75.0, 2, 30, "Iron"));

        products.add(new Health("Health Potion",
                "Restores health",
                10.0, 10, 50, 5));
    }

    public void showProducts()
    {
        for (int i = 0; i < products.size(); i++)
        {
            System.out.println((i + 1) + ". ");
            products.get(i).displayProduct();
        }
    }

    public SalableProduct getProduct(int index)
    {
        return products.get(index);
    }

    public int getSize()
    {
        return products.size();
    }

    public void addProduct(SalableProduct product)
    {
        products.add(product);
    }

    public void removeProduct(SalableProduct product)
    {
        products.remove(product);
    }

    public ArrayList<SalableProduct> getProducts()
    {
        return products;
    
    }
}