package com.ssk.sh.res;

import com.ssk.sh.core.enums.DemoStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author T0220165
 */
@Data
public class DemoInfoRes {

    private String name;

    private BigDecimal price;

    private String remark;
    @Schema(description = "状态",example = "success")
    private DemoStatus status;
}
