package com.ssk.sh.req;

import com.ssk.sh.core.enums.DemoStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author T0220165
 */
@Data
public class DemoInfoReq {
    @NotNull(message = "名称不能为空")
    private String name;
    @Min(value = 0, message = "价格不能小于0")
    private BigDecimal price;
    private String remark;
    private DemoStatus status;
}
