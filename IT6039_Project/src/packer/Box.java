package packer;

/**
 *
 * @author I.M.Bad
 */
public class Box {
        
    private Manifest contents;
    private Customer customer;
    private Depot depot; 
    private static int Capacity;
    private static int HeavyCapacity;
    //^^^added parameter Capacity

    public Box(Customer customer, Depot depot) {
        this.customer = customer;
        this.depot = depot;
        contents = new Manifest();
    }
    
    //added method for setting up capacity
    public void setCapacity(int thisBoxCapacity){
        Capacity = thisBoxCapacity;
    }
    
    //added method for setting up HEAVY capacity
    public void setIfHeavyCapacity(int thisHeavyCapacity){
        HeavyCapacity = thisHeavyCapacity;
    }
    
    public void addProduct(Product product) {
        if (canFit(product)) {
            contents.addProduct(product, 1);
        }
    }
     
    public void addProduct(Product product, int quantity) {
        if (canFit(product,quantity)); {
            contents.addProduct(product, quantity);
        }
    }
   
    public String getLabel() {
        StringBuilder label = new StringBuilder();
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
    }
    
    public String toString() {
        return getLabel();
    }
    
    public double getWeight() {
        //return contents.getWeight();
        //^^^ fixed: no method getWeight() in manifest
        return contents.getTotalWeight();
    }
    
    
    /* 
    public void addProduct(Product product) {
        if (canFit(product)) {
            contents.addProduct(product, 1);
        }
    }
    ^^^fixed: methos is already described*/
    
    public boolean canFit(Product p) {
        //return p.getWeight() < 40;
        return p.getWeight() < Capacity;
        
    }
    
    public boolean canFit(Product p, int quantity) {
        //return (p.getWeight() * quantity) < 40;
        return (p.getWeight() * quantity) < Capacity;
    }
    
    public double remainingCapacity() {
        //return 40 - this.getWeight();
        return Capacity - this.getWeight();
    }
    
    public boolean isFragile() {
        return contents.hasFragileItems();
    }
    
    public boolean isHazardous() {
        return contents.hasHazardousItems();
    }
    
    //added method if box is heavy
    public boolean isHeavy(){
        if (this.getWeight() > HeavyCapacity) {return true;}
        else {return false;}
    }
    
}
