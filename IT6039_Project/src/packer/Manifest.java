package packer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author I.M.Bad
 */
public class Manifest {
    
    // This tracks the quantity if each product in the manifest
    private Map<Product, Integer> quantities;
    // This keeps a list of all products ordered by weight
    private Set<Product> byWeight;

    public Manifest() {
        quantities = new HashMap<>();
        byWeight = new TreeSet<>(new ProductWeightComparator());
    }
    
    public void addProduct(Product p) {
        addProduct(p,1);
    }
    
    public void addProduct(Product p, int quantity) {
        if (quantities.containsKey(p)) {
           //quantities.put(p,quantities.get(p)*quantity);
           quantities.put(p,quantities.get(p) + quantity);
        }
        else {
            quantities.put(p,quantity);
            //added vvv            
            //byWeight.add(p);
            if(!byWeight.add(p)) {
                System.out.println("Couldn't add to Set");
            }
        }
    }
    
    public void removeProduct(Product p) {
        if (quantities.containsKey(p) && quantities.get(p) > 0) {
            quantities.put(p,quantities.get(p)-1);
        }
       
        if (quantities.get(p) == 0) {
            quantities.remove(p);
             byWeight.remove(p);
        }
        
    }
    
    public double getTotalWeight() {
        double weight = 0;
        //System.out.println("Products:" + quantities.keySet());
        
        for (Product p : quantities.keySet()) {
            //fixed vvv added weight
            weight = quantities.get(p) * p.getWeight() + weight;
            //System.out.println("Products quantity:" + quantities.get(p));
            //System.out.println("getting total weight of " + p.getName()+ " " + weight);
        }
        return weight;
    }
    
    public Product getHeaviestUnder(double weight) {
        for (Product p : byWeight) {
            if (p.getWeight() <= weight) {
                return p;
            }
        }
        return null;
       
    }
    
    public boolean isEmpty() {
        return byWeight.isEmpty();
    }
    
    public boolean containsProduct(Product p) {
        return quantities.containsKey(p) && quantities.get(p) > 0;
    }
    
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product p : byWeight) {
            result.append(p.getName());
            result.append(" x ");
            result.append(quantities.get(p));
            result.append("\n");
        }
        return result.substring(0, result.length()-1);

    }
    
    public boolean hasFragileItems() {
        for (Product p : quantities.keySet()) {
            if (p.isFragile()) {
                return true;
            }
        }
        return false;
    }
    
    //added method if there are hazards hasHazardousItems()
    public boolean hasHazardousItems() {
        for (Product p : quantities.keySet()) {
            if (p.isHazardous()) {
                return true;
            }
        }
        return false;
    }
    
//added method to get quantities for test purposes
    public Map<Product, Integer>  getQuantities(){
    return quantities; }
    
    
    
//missed }
}    

