package za.ac.cput.factory;

import za.ac.cput.domain.Customer;

public class CustomerFactory {
    public static Customer createCustomer(String customerId,String name,String email,String address){
        if(customerId==null||customerId.isEmpty()) return null;
        if(name==null||name.isEmpty()) return null;
        if(email==null||email.isEmpty()) return null;
        if(address==null||address.isEmpty()) return null;
        return new Customer.Builder()
                .setCustomerId(customerId)
                .setName(name)
                .setEmail(email)
                .setAddress(address)
                .build();
    }
}
