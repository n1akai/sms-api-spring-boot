package ma.aboulhoda.sales_management_system.ws.converter;

import ma.aboulhoda.sales_management_system.bean.Product;
import ma.aboulhoda.sales_management_system.ws.dto.ProductDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    @Autowired
    CustomerConverter customerConverter;

    public Product map(ProductDto dto) {
        Product entity = new Product();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    public ProductDto map(Product entity) {
        ProductDto dto = new ProductDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
