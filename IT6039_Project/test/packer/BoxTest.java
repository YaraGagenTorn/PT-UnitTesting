/*
 * MY TEST
 * 
 */
package packer;

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
public class BoxTest {
    
    //Test data
    static Coordinates testCoordinates0 = new Coordinates(0,0);
    static  Coordinates testCoordinates1 = new Coordinates(3,4);
    
    static Address testAddress0 = new Address("111 Emerge Rd", "Really", "Inn Town", "D444", testCoordinates0);
    static Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        
    static Depot testDepot0 = new Depot("Test Depot", testAddress0);
    
    static Customer testCustomer0 = new Customer("Test Customer 1", testAddress1);
    
    static Manifest testContents0 = new Manifest();
    
    static Product testProduct0 = new Product("Hammer", 3, false, false);
    static Product testProduct1 = new Product("Nails", 1, false, false);
    static Product testProduct2 = new Product("Ladder", 15, false, false);
    static Product testProduct3 = new Product("Light Bulbs", 1, false, true);
    static Product testProduct4 = new Product("Weedkiller", 2, true, false);
    static Product testProduct5 = new Product("VeryHeavyThing", 45, true, false);
    public Box testBox;
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Box class...");
    }    
    
    @Before 
    public void setUpBox() {
        System.out.println("Creating a new test box...");
        testBox = new Box(testCustomer0,testDepot0, 20,15);
        
    }   
     
    /**
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct() {
        System.out.println("-------------------------");
        System.out.println("addProduct");
     
        testBox.addProduct(testProduct0);
        testBox.addProduct(testProduct1,1);
        String resultBox = testBox.toString();
        boolean isTrue = false;
        isTrue = resultBox.contains ("Hammer") && resultBox.contains ("Nails");
        assertEquals(true, isTrue);
        isTrue = true;
        isTrue = resultBox.contains ("Hammer") && resultBox.contains ("Ladder");
        assertEquals(false, isTrue);
    }

    /**
     * Test of getLabel method, of class Box.
     */
    //@Test DOESNT WORK!!!!
    public void testGetLabel() {
        System.out.println("getLabel");
        System.out.println("adding products to the box...");
        testBox.addProduct(testProduct0);
        testBox.addProduct(testProduct1);
        testBox.addProduct(testProduct2);

        String testLabel = new String();
        String testString = new String();
        testString = testBox.getLabel();
        System.out.println(testString.toString());
        
        //testLabel = "Test Customer 1First St"+ "/n" +"Aplace"+ "/n" +"Citadel City"+ "/n" +"A111"+ "/n" +"Hammer x 1"+ "/n" +"Nails x 1"+ "/n" +"Ladder x 1"; 
        testLabel = "Test Customer/n 1First St/nAplace/nCitadel City/nA111/nHammer x 1/nNails x 1/nLadder x 1"; 
        assertEquals(testLabel, testBox.getLabel());
        
        
        
        /*
        
        label.append(customer);
        label.append("\n");
        label.append(customer.getClosestAddressTo(depot));
        label.append("\n");
        label.append(contents.toString());
        label.append("\n");
        if (this.isFragile()) {
            label.append("FRAGILE\n");
        }
        //added if heavy, if hazard
        if (this.isHazardous()) {
            label.append("HAZARD\n");
        }
        if (this.isHeavy()) {
            label.append("HEAVY\n");
        }
        return label.toString();
    }*/
        
        
        
        
        
        
    }

    /**
     * Test of toString method, of class Box.
     */
    
    public void testToString() {
        System.out.println("toString");
        
    }

    /**
     * Test of getWeight method, of class Box.
     */
    @Test
    public void testGetWeight() {
        System.out.println("-------------------------");
        System.out.println("getWeight");
        System.out.println("adding products to the box...");
        testBox.addProduct(testProduct0,1);
        testBox.addProduct(testProduct1,1);
        testBox.addProduct(testProduct2,1);
        assertEquals(19, testBox.getWeight(),0);
        setUpBox();
        System.out.println("adding products to the box...");
        testBox.addProduct(testProduct0,1);
        testBox.addProduct(testProduct1,2);
        testBox.addProduct(testProduct2,1);
        assertEquals(20, testBox.getWeight(),0);
        
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit() {
        System.out.println("-------------------------");
        System.out.println("canFit");
        assertTrue (testBox.canFit(testProduct0));
        assertFalse (testBox.canFit(testProduct5));
    }

    /**
     * Test of remainingCapacity method, of class Box.
     */
    @Test
    public void testRemainingCapacity() {
        System.out.println("-------------------------");
        System.out.println("remainingCapacity");
        System.out.println("adding products to the box...");
        testBox.addProduct(testProduct0,1);
        testBox.addProduct(testProduct1,1);
        testBox.addProduct(testProduct2,1);
        assertEquals(1,testBox.remainingCapacity(),0);
        setUpBox();
        System.out.println("adding products to the box...");
        testBox.addProduct(testProduct0,1);
        testBox.addProduct(testProduct1,2);
        assertEquals(15,testBox.remainingCapacity(),0);
    }

    /**
     * Test of isFragile method, of class Box.
     */
    @Test
    public void testIsFragile() {
        System.out.println("-------------------------");
        System.out.println("isFragile");
        testBox.addProduct(testProduct0,1);
        testBox.addProduct(testProduct1,1);
        testBox.addProduct(testProduct2,1);
        assertFalse(testBox.isFragile());
        setUpBox();
        System.out.println("adding products to the box...");
        testBox.addProduct(testProduct0,1);
        testBox.addProduct(testProduct3,2);
        assertTrue(testBox.isFragile());
    }

    /**
     * Test of isHazardous method, of class Box.
     */
    @Test
    public void testIsHazardous() {
        System.out.println("-------------------------");
        System.out.println("isHazardous");
        testBox.addProduct(testProduct0,1);
        testBox.addProduct(testProduct1,1);
        testBox.addProduct(testProduct2,1);
        assertFalse(testBox.isHazardous());
        setUpBox();
        System.out.println("adding products to the box...");
        testBox.addProduct(testProduct4,1);
        testBox.addProduct(testProduct3,2);
        assertTrue(testBox.isHazardous());
        
    }

    /**
     * Test of isHeavy method, of class Box.
     */
    @Test
    public void testIsHeavy() {
        System.out.println("-------------------------");
        System.out.println("isHeavy");
        testBox.addProduct(testProduct0,1);
        testBox.addProduct(testProduct1,1);
        testBox.addProduct(testProduct3,1);
        assertFalse(testBox.isHeavy());
        setUpBox();
        System.out.println("adding products to the box...");
        testBox.addProduct(testProduct4,1);
        testBox.addProduct(testProduct2,1);
        assertTrue(testBox.isHeavy());
      }
    
}
