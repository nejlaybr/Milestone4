package storefront;

/**
 * Represents a health item in the store.
 * Extends the SalableProduct class.
 *
 * @author Nejla Yber
 */
public class Health extends SalableProduct
{
    private int healingPoints;
    private int duration;

    /**
     * Default constructor for Jackson.
     */
    public Health()
    {
        super();
    }

    /**
     * Creates a health item product.
     *
     * @param name Product name
     * @param description Product description
     * @param price Product price
     * @param quantity Product quantity
     * @param healingPoints Health restoration value
     * @param duration Duration of effect
     */
    public Health(String name, String description,
                  double price, int quantity,
                  int healingPoints, int duration)
    {
        super(name, description, price, quantity);
        this.healingPoints = healingPoints;
        this.duration = duration;
    }

    public int getHealingPoints()
    {
        return healingPoints;
    }

    public void setHealingPoints(int healingPoints)
    {
        this.healingPoints = healingPoints;
    }

    public int getDuration()
    {
        return duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    @Override
    public String toString()
    {
        return super.toString() +
               " Healing Points: " + healingPoints +
               " Duration: " + duration;
    }
}