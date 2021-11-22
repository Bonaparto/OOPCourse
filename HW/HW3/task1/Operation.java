package HW.HW3.task1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Operation {
    private String operationType;
    private BigDecimal amount;
    private LocalDateTime time;
    
    public Operation(String opType, BigDecimal amount, LocalDateTime time) {
        this.operationType = opType;
        this.amount = amount;
        this.time = time;
    }

    public String toString() {
        return operationType + ' ' + amount + ' ' + time;
    }
}
