package ma.aboulhoda.sales_management_system.ws.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class CommandDto {
    private Long id;
    private CustomerDto customer;
    private String ref;
    private LocalDateTime dateCommand;
    private List<CommandItemDto> commandItems;
    private BigDecimal total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
