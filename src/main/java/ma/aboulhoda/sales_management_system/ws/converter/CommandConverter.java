package ma.aboulhoda.sales_management_system.ws.converter;

import ma.aboulhoda.sales_management_system.bean.Command;
import ma.aboulhoda.sales_management_system.bean.CommandItem;
import ma.aboulhoda.sales_management_system.ws.dto.CommandDto;
import ma.aboulhoda.sales_management_system.ws.dto.CommandItemDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommandConverter {

    @Autowired
    CustomerConverter customerConverter;
    @Autowired
    CommandItemConverter commandItemConverter;
    private boolean commandItems;

    public Command map(CommandDto dto) {
        Command entity = new Command();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    public CommandDto map(Command entity) {
        CommandDto dto = new CommandDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public List<Command> mapToEntity(List<CommandDto> dtos) {
        List<Command> items = new ArrayList<>();
        dtos.forEach(entity -> items.add(map(entity)));
        return items;
    }

    public List<CommandDto> mapToDto(List<Command> entities) {
        List<CommandDto> dtos = new ArrayList<>();
        entities.forEach(dto -> dtos.add(map(dto)));
        return dtos;
    }

    public boolean isCommandItems() {
        return commandItems;
    }

    public void setCommandItems(boolean commandItems) {
        this.commandItems = commandItems;
    }

    public void init(boolean value) {
        setCommandItems(true);
    }
}
