package ma.aboulhoda.sales_management_system.dao;

import ma.aboulhoda.sales_management_system.bean.CommandItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandItemDao extends JpaRepository<CommandItem, Long> {
    int deleteByCommandRef(String ref);
}
