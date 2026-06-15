package storefront;

/**
 * Represents an armor product in the store.
 * Extends the SalableProduct class.
 *
 * @author Nejla Yber
 */
public class Armor extends SalableProduct
{
    private int defense;
    private String armorMaterial;

    /**
     * Default constructor for Jackson.
     */
    public Armor()
    {
        super();
    }

    /**
     * Creates an armor product.
     *
     * @param name Product name
     * @param description Product description
     * @param price Product price
     * @param quantity Product quantity
     * @param defense Armor defense value
     * @param armorMaterial Armor material
     */
    public Armor(String name, String description,
                 double price, int quantity,
                 int defense, String armorMaterial)
    {
        super(name, description, price, quantity);
        this.defense = defense;
        this.armorMaterial = armorMaterial;
    }

    public int getDefense()
    {
        return defense;
    }

    public void setDefense(int defense)
    {
        this.defense = defense;
    }

    public String getArmorMaterial()
    {
        return armorMaterial;
    }

    public void setArmorMaterial(String armorMaterial)
    {
        this.armorMaterial = armorMaterial;
    }

    @Override
    public String toString()
    {
        return super.toString() +
               " Defense: " + defense +
               " Armor Material: " + armorMaterial;
    }
}