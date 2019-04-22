package tiku.p011;


import java.util.Optional;

public class P11 {
    public static void main(String[] args) {
        Address address = null;
        Optional<Address> addrs1 = Optional.ofNullable(address);
        Employee e1 = new Employee(addrs1);
        String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not avaialbe";


        System.out.println(eAddress);
    }

}

class Employee {
    Optional<Address> address;

    Employee(Optional<Address> address) {
        this.address = address;
    }
}


class Address {
    String city = "New Yord";

    public String getCity() {
        return city;
    }

    public String toString() {
        return city;
    }
}