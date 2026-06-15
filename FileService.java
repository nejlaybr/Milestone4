package storefront;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FileService
{
    public ArrayList<SalableProduct> loadInventory(String fileName)
            throws InventoryException
    {
        try
        {
            ObjectMapper mapper = new ObjectMapper();

            File file = new File(fileName);

            SalableProduct[] products =
                    mapper.readValue(
                            file,
                            SalableProduct[].class);

            ArrayList<SalableProduct> inventory =
                    new ArrayList<>();

            for (SalableProduct product : products)
            {
                inventory.add(product);
            }

            return inventory;
        }
        catch (IOException e)
        {
            throw new InventoryException(
                    "Unable to load inventory file.");
        }
    }
}