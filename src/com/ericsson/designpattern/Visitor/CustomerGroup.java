package com.ericsson.designpattern.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup {
    private List<Visitable> customers = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Visitable customer : customers)
            (customer).accept(visitor);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
