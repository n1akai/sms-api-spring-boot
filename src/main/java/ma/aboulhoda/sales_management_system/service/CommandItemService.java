package ma.aboulhoda.sales_management_system.service;

import jakarta.transaction.Transactional;
import ma.aboulhoda.sales_management_system.bean.CommandItem;
import ma.aboulhoda.sales_management_system.dao.CommandItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandItemService {
    @Autowired
    private CommandItemDao commandItemDao;


    public void save(CommandItem item) {
        commandItemDao.save(item);
    }

    @Transactional
    public int deleteByCommandCode(String code) {
        return commandItemDao.deleteByCommandRef(code);
    }
}
