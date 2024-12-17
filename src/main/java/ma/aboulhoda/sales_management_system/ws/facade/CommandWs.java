package ma.aboulhoda.sales_management_system.ws.facade;

import ma.aboulhoda.sales_management_system.bean.Command;
import ma.aboulhoda.sales_management_system.service.CommandService;
import ma.aboulhoda.sales_management_system.util.ProcessResult;
import ma.aboulhoda.sales_management_system.ws.converter.CommandConverter;
import ma.aboulhoda.sales_management_system.ws.converter.CommandItemConverter;
import ma.aboulhoda.sales_management_system.ws.dto.CommandDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/command/")
public class CommandWs {
    @Autowired
    CommandService commandService;

    @Autowired
    private CommandConverter commandConverter;

    @Autowired
    private CommandItemConverter commandItemConverter;


    @GetMapping("ref/{ref}")
    public CommandDto findByRef(@PathVariable String ref) {
        commandItemConverter.init(true);
        commandItemConverter.setCommand(false);
        return commandConverter.map(commandService.findByRef(ref));
    }

    @PostMapping("")
    public ProcessResult save(@RequestBody CommandDto commandDto) {
        commandConverter.init(true);
        commandItemConverter.init(true);
        Command command = commandConverter.map(commandDto);
        return commandService.save(command);
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return commandService.deleteByRef(ref);
    }

    @GetMapping("")
    public List<Command> findAll() {
        return commandService.findAll();
    }
}
