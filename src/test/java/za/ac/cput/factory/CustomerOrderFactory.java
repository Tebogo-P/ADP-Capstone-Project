package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import java.util.UUID;

public class CustomerOrderFactory {
    public static Customer createCustomer(String name, String email, String address) {
        return new Customer.Builder()
                .setCustomerId(UUID.randomUUID().toString())
                .setName(name)
                .setEmail(email)
                .setAddress(address)
                .build();
    }
}
