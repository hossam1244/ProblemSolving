package array;

public class DefangingAnIpAddress {

    public static void main(String[] args) {
        String address = "1.1.1.1";
    }

    static public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
