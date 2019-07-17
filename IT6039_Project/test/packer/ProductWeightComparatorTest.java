/*
 * MY TEST
 * 
 */
package packer;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import packer.Address;
import static packer.BoxTest.testCustomer0;
import packer.Coordinates;
import packer.Customer;
import packer.Depot;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 90053232
 */

public class ProductWeightComparatorTest  {
    //Test data
    Product testProduct0 = new Product("Hammer", 3, false, false);
    Product testProduct1 = new Product("Nails", 1, false, false);
    static Product testProduct2 = new Product("Ladder", 15, false, false);
    static Product testProduct3 = new Product("Light Bulbs", 1, false, true);
    static Product testProduct4 = new Product("Weedkiller", 2, true, false);
    static Product testProduct5 = new Product("VeryHeavyThing", 45, true, false);
    
    ProductWeightComparator testComparator= new ProductWeightComparator();
    
    /**
     * Test of compare method, of class ProductWeightComparator.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        assertEquals (-1,testComparator.compare (testProduct0,testProduct1),0);
        assertEquals (1,testComparator.compare (testProduct3,testProduct4),0);
    }
    
}
