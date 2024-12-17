package ma.aboulhoda.sales_management_system.ws.converter;

import ma.aboulhoda.sales_management_system.bean.Customer;
import ma.aboulhoda.sales_management_system.ws.dto.CustomerDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {

    public Customer map(CustomerDto dto) {
        Customer entity = new Customer();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    public CustomerDto map(Customer entity) {
        CustomerDto dto = new CustomerDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
