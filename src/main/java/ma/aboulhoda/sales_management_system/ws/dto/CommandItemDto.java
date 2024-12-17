package ma.aboulhoda.sales_management_system.ws.dto;

import java.math.BigDecimal;

public class CommandItemDto {
    private Long id;
    private CommandDto command;
    private ProductDto productDto;
    private BigDecimal quantity;
    private BigDecimal price;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public CommandDto getCommand() {
        return command;
    }

    public void setCommand(CommandDto commandDto) {
        this.command = commandDto;
    }

    public ProductDto getProduct() {
        return productDto;
    }

    public void setProduct(ProductDto productDto) {
        this.productDto = productDto;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
