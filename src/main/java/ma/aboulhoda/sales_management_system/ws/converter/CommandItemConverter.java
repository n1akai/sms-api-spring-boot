package ma.aboulhoda.sales_management_system.ws.converter;

import ma.aboulhoda.sales_management_system.bean.CommandItem;
import ma.aboulhoda.sales_management_system.ws.dto.CommandItemDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommandItemConverter {

    @Autowired
    private CommandConverter commandConverter;
    @Autowired
    private ProductConverter productConverter;
    private boolean product;
    private boolean command;

    public CommandItem map(CommandItemDto dto) {
        CommandItem entity = new CommandItem();
        BeanUtils.copyProperties(dto, entity);
        if (command && dto.getCommand() != null) {
            entity.setCommand(commandConverter.map(dto.getCommand()));
        }
        if (product && dto.getProduct() != null) {
            entity.setProduct(productConverter.map(dto.getProduct()));
        }
        return entity;
    }

    public CommandItemDto map(CommandItem entity) {
        CommandItemDto dto = new CommandItemDto();
        BeanUtils.copyProperties(entity, dto);
        if (command && entity.getCommand() != null) {
            dto.setCommand(commandConverter.map(entity.getCommand()));
        }
        if (product && entity.getProduct() != null) {
            dto.setProduct(productConverter.map(entity.getProduct()));
        }
        return dto;
    }

    public List<CommandItem> mapToEntity(List<CommandItemDto> dtos) {
        List<CommandItem> items = new ArrayList<>();
        dtos.forEach(entity -> items.add(map(entity)));
        return items;
    }

    public List<CommandItemDto> mapToDto(List<CommandItem> entities) {
        List<CommandItemDto> dtos = new ArrayList<>();
        entities.forEach(dto -> dtos.add(map(dto)));
        return dtos;
    }

    public boolean isProduct() {
        return product;
    }

    public void setProduct(boolean product) {
        this.product = product;
    }

    public boolean isCommand() {
        return command;
    }

    public void setCommand(boolean command) {
        this.command = command;
    }

    public void init(boolean value) {
        setProduct(value);
        setCommand(value);
    }
}
