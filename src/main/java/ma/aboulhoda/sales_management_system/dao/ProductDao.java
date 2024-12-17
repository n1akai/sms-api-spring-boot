package ma.aboulhoda.sales_management_system.dao;

import ma.aboulhoda.sales_management_system.bean.Command;
import ma.aboulhoda.sales_management_system.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
    Product findByReference(String reference);
}
