package com.ssk.sh.req;

import com.ssk.sh.core.anno.validate.DemoStatusValidate;
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
@Schema(description = "demo信息")
public class DemoInfoReq {
    @NotNull(message = "名称不能为空")
    @Schema(description = "名称" ,example = "demo")
    private String name;
    @Min(value = 0, message = "价格不能小于0")
    @Schema(description = "价格" ,example = "0.01")
    private BigDecimal price;
    @Schema(description = "备注" ,example = "demo")
    private String remark;

    @Schema(description = "状态" ,example = "success")
    @DemoStatusValidate(allowedValues = {DemoStatus.SUCCESS, DemoStatus.FAILED, DemoStatus.FORBIDDEN})
    private DemoStatus status;
}
