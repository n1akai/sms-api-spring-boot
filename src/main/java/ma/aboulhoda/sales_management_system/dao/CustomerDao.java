package ma.aboulhoda.sales_management_system.dao;

import ma.aboulhoda.sales_management_system.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}
