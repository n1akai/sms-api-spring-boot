package ma.aboulhoda.sales_management_system.service;

import ma.aboulhoda.sales_management_system.bean.Product;
import ma.aboulhoda.sales_management_system.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public Product findByReference(String reference) {
        return productDao.findByReference(reference);
    }
}
