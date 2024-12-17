package ma.aboulhoda.sales_management_system.dao;

import ma.aboulhoda.sales_management_system.bean.Command;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandDao extends JpaRepository<Command, Long> {
    Command findByRef(String ref);
    int deleteByRef(String ref);
}
