package ma.aboulhoda.sales_management_system.service;

import ma.aboulhoda.sales_management_system.bean.Command;
import ma.aboulhoda.sales_management_system.bean.CommandItem;
import ma.aboulhoda.sales_management_system.bean.Customer;
import ma.aboulhoda.sales_management_system.bean.Product;
import ma.aboulhoda.sales_management_system.dao.CommandDao;
import ma.aboulhoda.sales_management_system.util.ProcessResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommandService {

    @Autowired
    private CommandDao commandDao;

    public Command findByRef(String ref) {
        return commandDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        Command command = commandDao.findByRef(ref);
        if (command == null) {
            return -1;
        }
        int deletedCommands = commandDao.deleteByRef(ref);
        return deletedCommands;
    }

    public ProcessResult save(Command command) {
        ProcessResult processResult = validateSave(command);

        execSave(command, processResult);
        return processResult;
    }

    private ProcessResult validateSave(Command command) {
        int code;
        String message;

        if (findByRef(command.getRef()) != null) {
            code = -1;
            message = "Ref exists arleady";
        }else {
            code = 1;
            message = "Saved successfully!";
        }
        return new ProcessResult(code, message);
    }

    public Command execSave(Command command, ProcessResult processResult) {

        Command saved = commandDao.save(command);
        processResult.setOutput(saved);
        return saved;

    }

    public List<Command> findAll() {
        return commandDao.findAll();
    }
}
