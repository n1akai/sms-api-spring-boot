package ma.aboulhoda.sales_management_system.service;

import ma.aboulhoda.sales_management_system.bean.Customer;
import ma.aboulhoda.sales_management_system.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public Customer findByEmail(String email) {
        return customerDao.findByEmail(email);
    }
}
