package packer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bunta
 */
public class Packer {

    public static List<Box> packProducts(Customer c, Depot d, Manifest m) {
        List<Box> packedBoxes = new ArrayList<>();
        Box b = null;
        while (!m.isEmpty()) { // repeat until all items are packed
            if (b == null) {
                //fixed: c and d change places,  added capacity and heavy capacity
                b = new Box(c, d, 20, 15);
            }
            Product prodToAdd = m.getHeaviestUnder(b.remainingCapacity());
            if (prodToAdd == null) {
                packedBoxes.add(b);
                b = null;
            }
            else {
                b.addProduct(prodToAdd);
                m.removeProduct(prodToAdd);
            }  
        }
        if (b != null) {
            packedBoxes.add(b);
            // fixed packedBoxes.add(b);
        }
        return packedBoxes;
    }
    
}
