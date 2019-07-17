/*
 * MY TEST
 * 
 */
package packer;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import packer.Address;
import packer.Coordinates;
import packer.Customer;
import packer.Depot;
/**
 *
 * @author 90053232
 */
public class PackerTest {
    
     //Test data
    static Product testProduct0 = new Product("Hammer", 3, false, false);
    static Product testProduct1 = new Product("Nails", 1, false, false);
    static Product testProduct2 = new Product("Ladder", 15, false, false);
    static Product testProduct3 = new Product("Light Bulbs", 1, false, true);
    static Product testProduct4 = new Product("Weedkiller", 2, true, false);
    static Product testProduct5 = new Product("VeryHeavyThing", 45, true, false);
    
    Manifest testManifest;
    
    Address testDepotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
    Depot testDepot = new Depot("Main Depot", testDepotAddress);
    
    Address testCustomerAddress = new Address("67 Torch Rd", "Treeline", "Mt High", "T799", new Coordinates(1102, 87));
    Customer testCustomer = new Customer("Andy Bravo", testCustomerAddress);
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Packer class...");
    }    
    
    @Before 
    public void setUpManifest() {
        System.out.println("Creating a new test manifest...");
        testManifest = new Manifest();
        testManifest.addProduct(new Product("Hammer", 3, false, false), 1);
        testManifest.addProduct(new Product("Nails", 1, false, false), 12);
        testManifest.addProduct(new Product("Ladder", 15, false, false), 2);
        testManifest.addProduct(new Product("Saw", 5, false, false), 1);
        testManifest.addProduct(new Product("Light Bulbs", 1, false, true), 20);
        testManifest.addProduct(new Product("Weedkiller", 2, true, false), 1);
    }   

    /**
     * Test of packProducts method, of class Packer.
     */
    @Test
    public void testPackProducts() {
        System.out.println("packProducts");
        
        List<Box> testListOfBox = new ArrayList<>();
        testListOfBox = Packer.packProducts(testCustomer,testDepot,testManifest);
        for (Box b : testListOfBox) {
            System.out.println(b);
        }
    }
}
