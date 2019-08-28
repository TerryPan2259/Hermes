package onlineShop.dao;

import onlineShop.model.Customer;

//Data access object

public interface CustomerDao {
    
    void addCustomer(Customer customer);

    Customer getCustomerByUserName(String userName);
}
