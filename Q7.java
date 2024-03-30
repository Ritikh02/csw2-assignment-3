/*Write a java code that comprises of a class Address, having member
variable plot no, at, post and required parameterised constructor. Create
a Tree map having key as name of a person and value as address.
Insert required key and value in the created tree map and use an iterator to
display it.
 */

 import java.util.Iterator;
import java.util.TreeMap;

class Address {
    public String plotNo;
    public String at;
    public String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
}

public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();
        addressMap.put("Ritikh", new Address("123", "ITER", "BBSR"));
        addressMap.put("Prince", new Address("456", "ITER", "USA"));
        addressMap.put("Deepak", new Address("789", "ITER", "RUSSIA"));
        Iterator<String> iterator = addressMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            Address address = addressMap.get(name);
            System.out.println("Name: " + name + ", Address: Plot No. " + address.plotNo + ", " + address.at + ", " + address.post);
        }
    }
}
