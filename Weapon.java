package storefront;

/**
 * Represents a weapon product in the store.
 * Extends the SalableProduct class.
 *
 * @author Nejla Yber
 */
public class Weapon extends SalableProduct
{
    private int damage;
    private String weaponType;

    /**
     * Default constructor for Jackson.
     */
    public Weapon()
    {
        super();
    }

    /**
     * Creates a weapon product.
     *
     * @param name Product name
     * @param description Product description
     * @param price Product price
     * @param quantity Product quantity
     * @param damage Weapon damage
     * @param weaponType Weapon type
     */
    public Weapon(String name, String description,
                  double price, int quantity,
                  int damage, String weaponType)
    {
        super(name, description, price, quantity);
        this.damage = damage;
        this.weaponType = weaponType;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public String getWeaponType()
    {
        return weaponType;
    }

    public void setWeaponType(String weaponType)
    {
        this.weaponType = weaponType;
    }

    @Override
    public String toString()
    {
        return super.toString() +
               " Damage: " + damage +
               " Weapon Type: " + weaponType;
    }
}